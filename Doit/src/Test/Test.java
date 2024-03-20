
do {
	
try {
	p = st.pop();
}catch(Stack4.EmptyGenericStackException e){
	System.out.println("스택이 빔");
}
ix = p.getX();
iy = p.getY();	
d[ix][iy] = 0;
count--;
iy++;


}while(d.length);
}

while (true) {
    int newCol = nextMove(d, ix, iy);
//    System.out.println("newCol: " + newCol);
    if (newCol != -1) {
       iy = newCol;
       d[ix][iy] = 1;
       p = new Point(ix, iy);
       st.push(p);
       count++;
       ix++;
       iy = 0;

       if (ix == 8) {
          System.out.println("해결책" + numberSolutions);
          showQueens(d);
          numberSolutions++;
          d[ix - 1][iy] = 0; // 마지막 퀸을 제거하여 다음 경우를 탐색할 수 있도록 함
          ix--; // 마지막 퀸의 위치로 돌아감
          iy = p.iy + 1; // 다음 열부터 퀸을 놓을 수 있도록 함
          if (st.isEmpty()) { // 스택이 비어있다면 모든 해결책을 찾은 것이므로 종료
             break;
          }
//          p = st.pop(); // 스택에서 이전에 놓았던 퀸의 위치를 가져옴
          d[p.ix][p.iy] = 0; // 이전에 놓았던 퀸의 위치를 제거
          count--; // 퀸의 개수를 하나 줄임
          ix = p.ix; // 이전에 놓았던 퀸의 행으로 돌아감
          iy = p.iy + 1; // 다음 열부터 퀸을 놓을 수 있도록 함
          continue;
       }
       continue;
       // 이 부분은 else if(newCol == -1) 부분을 없애고 else로 수정했습니다.
       // 그 이유는 위의 조건문에서 newCol이 -1일 때 처리되기 때문에 이 부분은 실행될 일이 없기 때문입니다.
       // 따라서 불필요한 중복 코드를 제거했습니다.
    } else {
       try {
          p = st.pop();
       } catch (Chap5_재귀알고리즘.Stack4.EmptyGenericStackException e) {
//          e.printStackTrace();
          System.out.println("모든 해결책을 찾았다!");
          break;
       }
       ix = p.ix;
       iy = p.iy;
       d[ix][iy] = 0;
       count--;
       iy++;
       continue;
    }
 }
}