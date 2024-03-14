package com.ruby.java.ch10.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class TTT {

    public static void main(String[] args) {
        int totalTickets = 10000000;
        
        // 당첨 번호를 저장할 HashSet
        
        HashSet<Integer> winningNumbers = generateLottoNumbers();

        // 100장의 로또 티켓 생성
        ArrayList<HashSet<Integer>> tickets = generateLottoTickets(totalTickets);

        // 당첨 티켓 수 세기
        int[] winningCounts = countWinningTickets(tickets, winningNumbers);

        // 결과 출력
        displayStatistics(winningCounts);
    }

    // 로또 번호를 생성하는 메서드
    public static HashSet<Integer> generateLottoNumbers() {
        HashSet<Integer> lottoNumbersSet = new HashSet<>();

        Random random = new Random();

        // 6개의 로또 번호를 생성
        while (lottoNumbersSet.size() < 6) {
            int newNumber = random.nextInt(45) + 1;
            lottoNumbersSet.add(newNumber);
        }

        return lottoNumbersSet;
    }

    // 지정된 횟수만큼 로또 티켓을 생성하는 메서드
    public static ArrayList<HashSet<Integer>> generateLottoTickets(int totalTickets) {
        ArrayList<HashSet<Integer>> tickets = new ArrayList<>();

        for (int i = 0; i < totalTickets; i++) {
            HashSet<Integer> ticket = generateLottoNumbers();
            tickets.add(ticket);
        }

        return tickets;
    }

    // 당첨 티켓 수를 세는 메서드
    public static int[] countWinningTickets(ArrayList<HashSet<Integer>> tickets, HashSet<Integer> winningNumbers) {
        int[] winningCounts = new int[6]; // 1등부터 5등까지의 카운트 배열

        for (HashSet<Integer> ticket : tickets) {
            int matchingCount = countMatchingNumbers(ticket, winningNumbers);

            // 당첨 티켓을 1등부터 5등까지의 카운트에 반영
            if (matchingCount == 6) {
                winningCounts[1]++;
            } else if (matchingCount == 5) {
                winningCounts[2]++;
            } else if (matchingCount == 4) {
                winningCounts[3]++;
            } else if (matchingCount == 3) {
                winningCounts[4]++;
            } else if (matchingCount == 2) {
                winningCounts[5]++;
            }
        }

        return winningCounts;
    }

    // 두 개의 로또 번호 집합에서 일치하는 번호의 개수를 세는 메서드
    public static int countMatchingNumbers(HashSet<Integer> ticket, HashSet<Integer> winningNumbers) {
        int matchingCount = 0;

        for (int number : ticket) {
            if (winningNumbers.contains(number)) {
                matchingCount++;
            }
        }

        return matchingCount;
    }

    // 결과를 출력하는 메서드
    public static void displayStatistics(int[] winningCounts) {
        System.out.println("1등: " + winningCounts[1] + "회");
        System.out.println("2등: " + winningCounts[2] + "회");
        System.out.println("3등: " + winningCounts[3] + "회");
        System.out.println("4등: " + winningCounts[4] + "회");
        System.out.println("5등: " + winningCounts[5] + "회");
    }
}