package winterScene;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Tree extends AbstractShape {
	private int xShift;
	private int yShift;
	public Tree(int x, int y, int wid, int ht, Color col) {
		super(x, y, wid, ht, col);
		xShift = -80;
		yShift = 110;
	}

	@Override
	public void draw(Graphics window) {
		window.setFont(new Font("Consolas",1,14));
		window.setColor(getColor());
		window.drawString("                                                         .\n", 10+xShift, 10+yShift);
		window.drawString("                                              .         ;  \n", 10+xShift, 25+yShift);
		window.drawString("                 .              .              ;%     ;;   \n", 10+xShift, 40+yShift);
		window.drawString("                   ,           ,                :;%  %;   \n", 10+xShift,55+yShift);
		window.drawString("                    :         ;                   :;%;'     .,   \n", 10+xShift, 70+yShift);
		window.drawString("           ,.        %;     %;            ;        %;'    ,;\n", 10+xShift, 85+yShift);
		window.drawString("             ;       ;%;  %%;        ,     %;    ;%;    ,%'\n", 10+xShift, 100+yShift);
		window.drawString("              %;       %;%;      ,  ;       %;  ;%;   ,%;' \n", 10+xShift, 115+yShift);
		window.drawString("               ;%;      %;        ;%;        % ;%;  ,%;'\n", 10+xShift, 130+yShift);
		window.drawString("                `%;.     ;%;     %;'         `;%%;.%;'\n", 10+xShift, 145+yShift);
		window.drawString("                 `:;%.    ;%%. %@;        %; ;@%;%'\n", 10+xShift, 160+yShift);
		window.drawString("                    `:%;.  :;bd%;          %;@%;'\n", 10+xShift, 175+yShift);
		window.drawString("                      `@%:.  :;%.         ;@@%;'   \n", 10+xShift, 190+yShift);
		window.drawString("                        `@%.  `;@%.      ;@@%;         \n", 10+xShift, 205+yShift);
		window.drawString("                          `@%%. `@%%    ;@@%;        \n", 10+xShift, 220+yShift);
		window.drawString("                            ;@%. :@%%  %@@%;       \n", 10+xShift, 235+yShift);
		window.drawString("                              %@bd%%%bd%%:;     \n", 10+xShift, 250+yShift);
		window.drawString("                                #@%%%%%:;;\n", 10+xShift, 265+yShift);
		window.drawString("                                %@@%%%::;\n", 10+xShift, 280+yShift);
		window.drawString("                                %@@@%(o);  . '         \n", 10+xShift, 295+yShift);
		window.drawString("                                %@@@o%;:(.,'         \n", 10+xShift, 310+yShift);
		window.drawString("                            `.. %@@@o%::;         \n", 10+xShift, 325+yShift);
		window.drawString("                               `)@@@o%::;         \n", 10+xShift, 340+yShift);
		window.drawString("                                %@@(o)::;        \n", 10+xShift, 355+yShift);
		window.drawString("                               .%@@@@%::;         \n", 10+xShift, 370+yShift);
		window.drawString("                               ;%@@@@%::;.          \n", 10+xShift, 385+yShift);
		window.drawString("                              ;%@@@@%%:;;;. \n", 10+xShift, 400+yShift);
		window.drawString("                          ...;%@@@@@%%:;;;;,..    ", 10+xShift, 415+yShift);

		/*
		 * window.
		 * drawString("                                                         .\r\n" +
		 * "                                              .         ;  \r\n" +
		 * "                 .              .              ;%     ;;   \r\n" +
		 * "                   ,           ,                :;%  %;   \r\n" +
		 * "                    :         ;                   :;%;'     .,   \r\n" +
		 * "           ,.        %;     %;            ;        %;'    ,;\r\n" +
		 * "             ;       ;%;  %%;        ,     %;    ;%;    ,%'\r\n" +
		 * "              %;       %;%;      ,  ;       %;  ;%;   ,%;' \r\n" +
		 * "               ;%;      %;        ;%;        % ;%;  ,%;'\r\n" +
		 * "                `%;.     ;%;     %;'         `;%%;.%;'\r\n" +
		 * "                 `:;%.    ;%%. %@;        %; ;@%;%'\r\n" +
		 * "                    `:%;.  :;bd%;          %;@%;'\r\n" +
		 * "                      `@%:.  :;%.         ;@@%;'   \r\n" +
		 * "                        `@%.  `;@%.      ;@@%;         \r\n" +
		 * "                          `@%%. `@%%    ;@@%;        \r\n" +
		 * "                            ;@%. :@%%  %@@%;       \r\n" +
		 * "                              %@bd%%%bd%%:;     \r\n" +
		 * "                                #@%%%%%:;;\r\n" +
		 * "                                %@@%%%::;\r\n" +
		 * "                                %@@@%(o);  . '         \r\n" +
		 * "                                %@@@o%;:(.,'         \r\n" +
		 * "                            `.. %@@@o%::;         \r\n" +
		 * "                               `)@@@o%::;         \r\n" +
		 * "                                %@@(o)::;        \r\n" +
		 * "                               .%@@@@%::;         \r\n" +
		 * "                               ;%@@@@%::;.          \r\n" +
		 * "                              ;%@@@@%%:;;;. \r\n" +
		 * "                          ...;%@@@@@%%:;;;;,..    ", 100, 100);
		 */

	}

	@Override
	public void moveAndDraw(Graphics window) {
		// Auto-generated method stub

	}

}
