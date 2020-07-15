package com.fakecorp;


import com.fakecorp.GUI.QuizJeux;
import com.fakecorp.controllers.MatchController;


import java.awt.*;


public class Program {


	public static void main(String[] args) {
		/*MatchController matchController = new MatchController();
		System.out.println(matchController.setBanqueFichier("/home/hamza/Desktop/data.csv"));
		for (String s:matchController.tirerQuestion()){
			System.out.println(s);
		}

*/
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizJeux jeuQuiz = new QuizJeux();
					jeuQuiz.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



}



/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizJeux jeuQuiz = new QuizJeux();
					jeuQuiz.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/