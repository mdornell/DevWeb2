/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import model.application.AplCadastrarAtor;
import model.domain.Ator;

/**
 *
 * @author Marco
 */
@WebServlet(name = "index", value = "/cadastrarAtor")
public class ServletAtor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            String nome = request.getParameter("nome");
//            String id = request.getParameter("id");
//
//            AplCadastrarAtor aplA = new AplCadastrarAtor();
//            
//             Ator a;
//            
//            if(id == null){
//               a =  new Ator(nome);
//               aplA.inserirAtor(a);
//            }else{
//                int index =  Integer.parseInt(id);
//                a =  new Ator(index,nome);
//                aplA.atualizarAtor(a);
//            }
//            
//            List<Ator> lAtor = aplA.listarAtor(Ator.class);
//            
//            request.setAttribute("array", lAtor);
//            request.getRequestDispatcher("index.jsp").forward(request, response);
//         
//        }
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
//        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String nome = request.getParameter("nome");
            String id = request.getParameter("id");

            AplCadastrarAtor aplA = new AplCadastrarAtor();

            Ator a;

            if (id == null) {
                a = new Ator(nome);
                aplA.inserirAtor(a);
            } else {
                int index = Integer.parseInt(id);
                a = new Ator(index, nome);
                aplA.atualizarAtor(a);
            }

            List<Ator> lAtor = aplA.listarAtor(Ator.class);

            request.setAttribute("array", lAtor);
            request.getRequestDispatcher("index.jsp").forward(request, response);

        }
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
//        processRequest(request, response);
        response.setContentType("text/html");
        AplCadastrarAtor aplCadastrarAtor = new AplCadastrarAtor();

        //Editar
        if (request.getParameter("hid").equals("1")) { //Editar
            int id = Integer.parseInt(request.getParameter("id").trim());
            String nome = request.getParameter("nome").trim();
            Ator ator = new Ator(id,nome);
            System.out.println("teve game?");
            System.out.println(nome);
            aplCadastrarAtor.atualizarAtor(ator);
        } else { //Excluir
            int id = Integer.parseInt(request.getParameter("id").trim());
            String nome = request.getParameter("nome").trim();
            Ator ator = new Ator(id,nome);
            aplCadastrarAtor.excluirAtor(ator);
        }

        List<Ator> lista = aplCadastrarAtor.listarAtor(Ator.class);
        request.setAttribute("array", lista);
        request.getRequestDispatcher("index.jsp").forward(request, response);

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
