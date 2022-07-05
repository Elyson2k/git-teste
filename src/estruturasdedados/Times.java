package estruturasdedados;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Times {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdAlunos = sc.nextInt();
		int qtdTimes = sc.nextInt();
		List<Entry<Integer, Integer>> alunos = new ArrayList<Entry<Integer, Integer>>();
		for (int i = 0; i < qtdAlunos; i++) {
			String nome = sc.next();
			int fut = sc.nextInt();
			Map<Integer, String> m = new HashMap<Integer, String>();
			m.put(fut, nome);
			Entry aluno = (Entry) m.entrySet();
			alunos.add(aluno);
		}
		for(Entry item : alunos) {
			System.out.println(item);
		}
//		Collections.sort(list, new Comparator<Object>() {
//			@SuppressWarnings("unchecked")
//			public int compare(Object o1, Object o2) {
//				return ((Comparable<Integer>) ((Map.Entry<Integer, Integer>) (o1)).getValue())
//						.compareTo(((Map.Entry<Integer, Integer>) (o2)).getValue());
//			}
//		});
//		for (Map.Entry m : alunos.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
//		}

	}

}
