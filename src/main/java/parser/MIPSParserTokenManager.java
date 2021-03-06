/* MIPSParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. MIPSParserTokenManager.java */
package parser;
import java.util.ArrayList;
import instructions.*;
import main.Utils;

/** Token Manager. */
@SuppressWarnings("unused")public class MIPSParserTokenManager implements MIPSParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x140L) != 0L)
            return 2;
         return -1;
      case 1:
         if ((active0 & 0x100L) != 0L)
            return 0;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 36:
         return jjStopAtPos(0, 59);
      case 47:
         return jjMoveStringLiteralDfa1_0(0x140L);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x1803c000L);
      case 98:
         jjmatchedKind = 43;
         return jjMoveStringLiteralDfa1_0(0x1ff00000000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x300000L);
      case 106:
         jjmatchedKind = 53;
         return jjMoveStringLiteralDfa1_0(0x40000000000000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x40002000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x180000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x60000000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x1f807cc0000L);
      case 120:
         return jjMoveStringLiteralDfa1_0(0x600000000L);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(1, 8, 0);
         break;
      case 47:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x40100000000000L);
      case 100:
         return jjMoveStringLiteralDfa2_0(active0, 0x3c000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000006000000L);
      case 103:
         return jjMoveStringLiteralDfa2_0(active0, 0xe00000000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x7001801f00000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000018000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x60640002000L);
      case 114:
         if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x1e100000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x200c0000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000L);
      case 98:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(2, 25);
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 100:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x10038000L);
      case 101:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStopAtPos(2, 52);
         return jjMoveStringLiteralDfa3_0(active0, 0x1a00000000000L);
      case 104:
         if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(2, 26);
         break;
      case 105:
         if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(2, 29);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(2, 32);
         break;
      case 108:
         if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 39;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(2, 44);
         else if ((active0 & 0x40000000000000L) != 0L)
            return jjStopAtPos(2, 54);
         return jjMoveStringLiteralDfa3_0(active0, 0x11000000000L);
      case 111:
         if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(2, 20);
         break;
      case 112:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(2, 13);
         break;
      case 113:
         if ((active0 & 0x8000000000000L) != 0L)
            return jjStopAtPos(2, 51);
         break;
      case 114:
         if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(2, 30);
         else if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      case 116:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x6460001800000L);
      case 122:
         if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(2, 21);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 105:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(3, 28);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(3, 34);
         return jjMoveStringLiteralDfa4_0(active0, 0x1010000L);
      case 114:
         if ((active0 & 0x20000000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000000L);
      case 117:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(3, 17);
         else if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(3, 19);
         break;
      case 118:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(3, 36);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(3, 38);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(3, 40);
         break;
      case 122:
         if ((active0 & 0x200000000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x400000000000L) != 0L)
            return jjStopAtPos(3, 46);
         else if ((active0 & 0x1000000000000L) != 0L)
            return jjStopAtPos(3, 48);
         else if ((active0 & 0x2000000000000L) != 0L)
         {
            jjmatchedKind = 49;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x4800000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x4800000000000L);
      case 117:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(4, 16);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(4, 24);
         break;
      case 118:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(4, 42);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 108:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStopAtPos(5, 47);
         else if ((active0 & 0x4000000000000L) != 0L)
            return jjStopAtPos(5, 50);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 11;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 55)
                        kind = 55;
                     { jjCheckNAddTwoStates(5, 6); }
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 55)
                        kind = 55;
                     { jjCheckNAddStates(0, 2); }
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 0:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if ((0xffff7fffffffffffL & l) != 0L && kind > 7)
                     kind = 7;
                  break;
               case 2:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 4:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  { jjCheckNAddTwoStates(5, 6); }
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  { jjCheckNAddTwoStates(5, 6); }
                  break;
               case 7:
                  if (curChar != 48)
                     break;
                  if (kind > 55)
                     kind = 55;
                  { jjCheckNAddStates(0, 2); }
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  { jjCheckNAddTwoStates(9, 6); }
                  break;
               case 10:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  { jjCheckNAddTwoStates(10, 6); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if (kind > 7)
                     kind = 7;
                  break;
               case 6:
                  if ((0x100000001000L & l) != 0L && kind > 55)
                     kind = 55;
                  break;
               case 8:
                  if ((0x100000001000000L & l) != 0L)
                     { jjCheckNAdd(9); }
                  break;
               case 9:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  { jjCheckNAddTwoStates(9, 6); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2) && kind > 7)
                     kind = 7;
                  break;
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 11 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_3(){
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_3(0x800L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_3(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(1, 11);
         break;
      default :
         return 2;
   }
   return 2;
}
private int jjMoveStringLiteralDfa0_1()
{
   return jjMoveNfa_1(0, 0);
}
private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x2400L & l) != 0L)
                  {
                     if (kind > 9)
                        kind = 9;
                  }
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if (curChar == 10 && kind > 9)
                     kind = 9;
                  break;
               case 2:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_2(){
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_2(0x400L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_2(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(1, 10);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   8, 10, 6, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
"\156\157\160", "\141\144\144", "\141\144\144\151", "\141\144\144\151\165", 
"\141\144\144\165", "\163\165\142", "\163\165\142\165", "\143\154\157", "\143\154\172", 
"\163\154\164", "\163\154\164\151", "\163\154\164\151\165", "\163\145\142", "\163\145\150", 
"\141\156\144", "\141\156\144\151", "\154\165\151", "\156\157\162", "\157\162", 
"\157\162\151", "\170\157\162", "\170\157\162\151", "\163\154\154", "\163\154\154\166", 
"\163\162\141", "\163\162\141\166", "\163\162\154", "\163\162\154\166", "\162\157\164\162", 
"\162\157\164\162\166", "\142", "\142\141\154", "\142\147\145\172", "\142\147\164\172", 
"\142\147\145\172\141\154", "\142\154\145\172", "\142\154\164\172", "\142\154\164\172\141\154", 
"\142\145\161", "\142\156\145", "\152", "\152\141\154", null, null, null, null, "\44", };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 12)
         {
            jjmatchedKind = 12;
         }
         break;
       case 2:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         if (jjmatchedPos == 0 && jjmatchedKind > 12)
         {
            jjmatchedKind = 12;
         }
         break;
       case 3:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_3();
         if (jjmatchedPos == 0 && jjmatchedKind > 12)
         {
            jjmatchedKind = 12;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        MoreLexicalActions();
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      case 7 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
                         input_stream.backup(1);
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public MIPSParserTokenManager(JavaCharStream stream){

      if (JavaCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public MIPSParserTokenManager (JavaCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  public void ReInit(JavaCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 11; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(JavaCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 4 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_SINGLE_LINE_COMMENT",
   "IN_FORMAL_COMMENT",
   "IN_MULTI_LINE_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, 1, 2, 3, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x8ffffffffffe001L, 
};
static final long[] jjtoSkip = {
   0xe3eL, 
};
static final long[] jjtoSpecial = {
   0xe00L, 
};
static final long[] jjtoMore = {
   0x11c0L, 
};
    protected JavaCharStream  input_stream;

    private final int[] jjrounds = new int[11];
    private final int[] jjstateSet = new int[2 * 11];

    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    
    protected char curChar;
}
