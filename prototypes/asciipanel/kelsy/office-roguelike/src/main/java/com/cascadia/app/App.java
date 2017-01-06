package com.cascadia.app;

import javax.swing.JFrame;
import asciiPanel.AsciiPanel;
/**
 * Basic "from scratch" roguelike based on a tutorial:
 * http://trystans.blogspot.com/2016/01/roguelike-tutorial-00-table-of-contents.html
 *
 */
public class App extends JFrame {
  private static final long serialVersionUID = 1060623638149583738L;

  private AsciiPanel terminal;

  public App(){
    super();
    terminal = new AsciiPanel();
    terminal.write("OFFICE ROGUELIKE GO GO", 1, 1);
    add(terminal);
    pack();
  }

  public static void main(String[] args) {
    App app = new App();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.setVisible(true);
  }
}
