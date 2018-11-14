<%@ page contentType="text/html;charset=UTF-8">
<%!
public double triangle(double width, double height)
 {
     double ret= width * height / 2;
     return ret;
 }
 %>
三角形の面積 （底辺５、高さ２の場合）：
<%=triangle(5,2) %>
