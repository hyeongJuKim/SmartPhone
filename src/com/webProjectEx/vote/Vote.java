package com.webProjectEx.vote;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 투표에 관된 서블릿
 */
@WebServlet("/vote")
public class Vote extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String phoneKind = request.getParameter("phoneKind");
		
//		// request가 잘 넘어왔는지 확인 테스
//		System.out.println(name);
//		System.out.println(phoneKind);
		
		request.setAttribute("name", name);
		request.setAttribute("phoneKind", phoneKind);
		RequestDispatcher view = request.getRequestDispatcher("voteResult.jsp");
		view.forward(request, response);
		
	}

}
