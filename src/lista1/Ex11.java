/*
 * Copyright (C) 2024 Daniel Douglas <danieldouglas26@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/* 

Flores de Fogo - EX 11

Nos dias atuais uma flor de fogo não é algo considerado estranho para muitos jovens.  Isso porque um famoso jogo de videogame popularizou esse tipo de flor. Nesse jogo o protagonista ganhava superpoderes ao tocar em uma flor de fogo, passando a atirar pequenas bolas de fogo para derrotar seus inimigos.

No entanto, já se falava sobre flores de fogo há muito tempo atrás. Na mitologia polonesa, flores de fogo são flores místicas de grande poder guardadas por espíritos malignos. Ela possuía esse nome porque brilhava tanto que era impossível olhá-la diretamente. Quem possuísse uma flor dessas ganharia a habilidade de ler a mente de outras pessoas, encontrar tesouros escondidos e repelir todos os males.

Para obter uma flor de fogo, a pessoa deveria procurá-la em uma floresta antes da meia-noite na véspera do Noc Kupały. Exatamente à meia-noite ela floresceria. Para colhê-la seria preciso desenhar um círculo em volta dela. Parece uma tarefa fácil, no entanto, os espíritos malignos que guardam a flor tentariam de tudo para distrair qualquer um tentando colher a flor. Se a pessoa falhasse ao tentar desenhar um círculo em volta da flor, teria sua vida sacrificada.

Dados dois círculos, um desenhado por um ambicioso caçador de flores de fogo e outro representando a área da flor, sua tarefa é determinar se o caçador morre ou fica rico com sua conquista.

Entrada
A entrada é composta por diversas instâncias e termina com final de arquivo (EOF). Cada instância consiste em uma linha com seis inteiros, R1 (1 ≤ R1) , X1(|X1|), Y1(|Y1|), R2 (R2 ≤ 1000), X2(|X2|), Y2 (Y2 ≤ 1000). O círculo desenhado pelo caçador possui raio R1 e centro (X1; Y1). O círculo representando a área da flor possui raio R2 e centro (X2; Y2).

Saída
Para cada instância imprima uma única linha contendo MORTO, se o caçador morre, ou RICO se o caçador consegue colher a flor.
*/

package lista1;
import java.util.Scanner;
/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 28/02/2024
 * @brief Class Ex11
 */
public class Ex11 {

    public static void main(String[] args) {
        
   Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int r1 = scan.nextInt();
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			
			int r2 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			
			double d = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
			
			if((r1 - d) >=r2) {
				System.out.println("RICO");
			}else {
				System.out.println("MORTO");
			}
		}
	}
}