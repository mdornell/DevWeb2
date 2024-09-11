<%@page import="model.application.AplCadastrarAtor"%>
<%@page import="model.domain.Ator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Agenda de Ators</title>

        <!-- Meu CSS -->
        <link rel="stylesheet" href="style/style.css">

        <!-- Bootstrap CSS -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link rel="stylesheet" href="style/style.css">

        <!-- Scripts -->
        <script src="src/script.js"></script>

        <!-- Bootstrap JS (Optional) -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>
    </head>

    <body>
        <main class="container mt-4">
            <!-- Formulario -->
            <section class="formulario mb-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Adicionar Ator</h5>
                        <form method="post" action="cadastrarAtor">
                            <div class="form-group">
                                <label for="nome">Nome:</label>
                                <input type="text" class="form-control" id="nome" name="nome" required>
                            </div>
                            <button type="submit" class="btn btn-primary">Inserir</button>
                        </form>
                    </div>
                </div>
            </section>
            

            <!-- Inserir Ator -->
            <!-- Código JSP para Processar Inserção usando Hibernate -->
            <%
                String nome = request.getParameter("nome");

                if (nome != null) {
                    Ator ator = new Ator();
                    ator.setNome(nome);

                    AplCadastrarAtor dao = new AplCadastrarAtor();
                    dao.inserirAtor(ator);

                    out.println("<div class='alert alert-success'>Ator inserido com sucesso!</div>");
                    
                }
            %>

            <!-- Atores -->
            <section class="Atores">
                <div class="table-responsive">
                    <table class="table table-bordered" id="tabAtores">
                        <thead class="thead-light">
                            <tr>
                                <th>Nome</th>
                                <th>Options</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%-- Aqui vocÃª pode carregar Ators do banco de dados --%>
                            <%

                            %>
                        </tbody>
                    </table>
                </div>
            </section>
        </main>


    </body>

</html>