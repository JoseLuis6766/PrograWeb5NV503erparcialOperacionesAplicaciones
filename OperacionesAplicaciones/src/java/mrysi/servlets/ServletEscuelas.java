/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mrysi.servlets;

/**
 *
 * @author Jose Luis
 */
public class ServletEscuelas extends HttpServlet {
    
    Connection connect;
    Statement statement;
    ResultSet resultSet;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException{
        try{
Class . forName ( "com.mysql.jdbc.Driver" ) ;
String URL = "jdbc:mysql://localhost/mrysiEscuelas?user=root&password=root";

connect = DriverManager.getConnection(URL);
statement = connect.createStatement();

request.setAttribute("ListaEscuelas", getListaEscuelas());
 connect.close();
 

public List<Escuela> getListaEscueIas() throws SQLException{
String query
"SELECT * from Escuelas";
resultSet = statement.executeQuery(query) ;
List<Escuela> Escuelas = new ArrayList();
Escuela escuela;
White ( .
escuela = nev Escueta();
escuela . setCIaveEscueIa( resultSet . getString( 1) ) ;
escuela . setNombreEscueta ( resultSet . getString (2) ) ;
escuela . setDomiciIio( resultSet . getString( 3) ) ;
escuela . setCodigoPostat ( resultSet . getlnt( 4) ) ;
escuela . setTurno( resultSet . getString( 5 ) ) ;
escuela . setIdLocatidad ( resultSet . getlnt( 6 ) ) ;
Escuelas. acid (escuela) ;
return Escuelas;
}

