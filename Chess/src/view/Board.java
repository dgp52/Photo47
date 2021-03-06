/**Chess Game
 * @author hassan and deep
 *
 */

package view;

import model.AbstractPiece;

public class Board {
	public  AbstractPiece[][] ps = new AbstractPiece [8][8]; 
	int counter = 8;

	/**updates the board when called
	 * 
	 */
	public void update() {
		System.out.println("");
		for(int i = 0; i< ps.length; i++){
			for(int j= 0; j<ps.length; j++){
				if(ps[i][j] == null){
					if((i+j)%2 != 0){
						System.out.print("##" + " ");
					}else {
						System.out.print("   ");
					}
				} else {
					System.out.print(ps[i][j] + " ");
				}
			}
			System.out.print(counter--);
			System.out.println();
		}
		System.out.print(" a  b  c  d  e  f  g  h");
		System.out.println("\n");
		counter =8;
	}
}