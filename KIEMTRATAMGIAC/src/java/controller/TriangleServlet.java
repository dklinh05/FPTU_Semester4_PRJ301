/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import static java.lang.System.out;

/**
 *
 * @author ASUS
 */
public class TriangleServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TriangleServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TriangleServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Lấy giá trị 3 cạnh từ form
        double a = Double.parseDouble(request.getParameter("a"));
        double b = Double.parseDouble(request.getParameter("b"));
        double c = Double.parseDouble(request.getParameter("c"));
        double perimeter = a + b + c;
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Công thức Heron 
        // Kiểm tra loại tam giác
        String triangleType;
        if (a + b > c && a + c > b && b + c > a) { // Kiểm tra điều kiện là tam giác
            if (a == b && b == c) {
                triangleType = "Tam giác đều";
            } else if (a == b || b == c || a == c) {
                if (isRightTriangle(a, b, c)) {
                    triangleType = "Tam giác vuông cân";

                    out.println("<p>Chu vi: " + perimeter + "</p>");
                    out.println("<p>Diện tích: " + area + "</p>");
                } else {

                    triangleType = "Tam giác cân";
                    out.println("<p>Chu vi: " + perimeter + "</p>");
                    out.println("<p>Diện tích: " + area + "</p>");
                }
            } else if (isRightTriangle(a, b, c)) {

                triangleType = "Tam giác vuông";
                out.println("<p>Chu vi: " + perimeter + "</p>");
                out.println("<p>Diện tích: " + area + "</p>");
            } else {

                triangleType = "Tam giác thường";
                out.println("<p>Chu vi: " + perimeter + "</p>");
                out.println("<p>Diện tích: " + area + "</p>");
            }
        } else {
            triangleType = "Không phải là tam giác";
        }

        // Gửi kết quả sang result.jsp
        request.setAttribute("perimeter", perimeter);
                request.setAttribute("area", area);
        request.setAttribute("triangleType", triangleType);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    private boolean isRightTriangle(double a, double b, double c) {
        double max = Math.max(a, Math.max(b, c));
        if (max == a) {
            return Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2);
        } else if (max == b) {
            return Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2);
        } else {
            return Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
