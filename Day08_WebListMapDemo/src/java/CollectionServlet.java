/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ASUS
 */
public class CollectionServlet extends HttpServlet {

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
            out.println("<title>Servlet CollectionServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CollectionServlet at " + request.getContextPath() + "</h1>");
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
        
        // Tạo danh sách sinh viên và điểm số của từng người
        Map<String, Map<String, Double>> studentMarks = new HashMap<>();

        // Thêm điểm của từng sinh viên
        Map<String, Double> marksA = new HashMap<>();
        marksA.put("Java", 8.5);
        marksA.put("Math", 9.0);
        marksA.put("Eng", 7.5);
        studentMarks.put("A Nguyen", marksA);

        Map<String, Double> marksB = new HashMap<>();
        marksB.put("Java", 7.5);
        marksB.put("Math", 8.0);
        marksB.put("Eng", 9.0);
        studentMarks.put("B Tran", marksB);

        Map<String, Double> marksC = new HashMap<>();
        marksC.put("Java", 6.5);
        marksC.put("Math", 7.0);
        marksC.put("Eng", 8.5);
        studentMarks.put("C Le", marksC);

        // Gửi dữ liệu đến JSP
        request.setAttribute("studentMarks", studentMarks);
        request.getRequestDispatcher("result.jsp").forward(request, response);
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
        processRequest(request, response);
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
