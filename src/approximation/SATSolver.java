package approximation;
public class SATSolver { public static boolean evaluate(int[][] clauses,boolean[] x){for(int[] c:clauses){boolean ok=false;for(int lit:c){int v=Math.abs(lit)-1;boolean val=x[v];if(lit<0)val=!val;if(val){ok=true;break;}}if(!ok)return false;}return true;} }
