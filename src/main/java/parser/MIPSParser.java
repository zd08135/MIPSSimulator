/* MIPSParser.java */
/* Generated By:JavaCC: Do not edit this line. MIPSParser.java */
package parser;

import java.util.ArrayList;

import instructions.*;
import main.Utils;

public class MIPSParser implements MIPSParserConstants {
    ArrayList<Instruction> instrs;
        public void parse() throws ParseException
        {
            input();
        }

    public static void printParseException(ParseException pe)
    {
        System.err.println(pe.getMessage());
    }

    public ArrayList<Instruction> getInstrs()
    {
        return instrs;
    }

/** Root production. */
  final public 
void input() throws ParseException, ParseException {instrs = new ArrayList<Instruction>();
    label_1:
    while (true) {
      if (jj_2_1(2)) {
        ;
      } else {
        break label_1;
      }
      instruction();
    }
    jj_consume_token(0);
  }

  final public void instruction() throws ParseException, ParseException {Token t;
    int rs, rd, rt, shamt, target;
    short imm, offset;
    if (jj_2_2(2)) {
      jj_consume_token(NOP);
instrs.add(new Nop());
    } else if (jj_2_3(2)) {
      jj_consume_token(ADD);
      rd = get_reg();
      rs = get_reg();
      rt = get_reg();
instrs.add(new Add(rd, rs, rt));
    } else if (jj_2_4(2)) {
      jj_consume_token(ADDI);
      rt = get_reg();
      rs = get_reg();
      imm = get_imm();
instrs.add(new Addi(rs, rt, imm));
    } else if (jj_2_5(2)) {
      jj_consume_token(ADDIU);
      rt = get_reg();
      rs = get_reg();
      imm = get_imm();
instrs.add(new Addiu(rs, rt, imm));
    } else if (jj_2_6(2)) {
      jj_consume_token(ADDU);
      rd = get_reg();
      rs = get_reg();
      rt = get_reg();
instrs.add(new Addu(rd, rs, rt));
    } else if (jj_2_7(2)) {
      jj_consume_token(SUB);
      rd = get_reg();
      rs = get_reg();
      rt = get_reg();
instrs.add(new Sub(rd, rs, rt));
    } else if (jj_2_8(2)) {
      jj_consume_token(SUBU);
      rd = get_reg();
      rs = get_reg();
      rt = get_reg();
instrs.add(new Subu(rd, rs, rt));
    } else if (jj_2_9(2)) {
      jj_consume_token(CLO);
      rd = get_reg();
      rs = get_reg();
instrs.add(new Clo(rd, rs));
    } else if (jj_2_10(2)) {
      jj_consume_token(CLZ);
      rd = get_reg();
      rs = get_reg();
instrs.add(new Clz(rd, rs));
    } else if (jj_2_11(2)) {
      jj_consume_token(SLT);
      rd = get_reg();
      rs = get_reg();
      rt = get_reg();
instrs.add(new Slt(rd, rs, rt));
    } else if (jj_2_12(2)) {
      jj_consume_token(SLTI);
      rt = get_reg();
      rs = get_reg();
      imm = get_imm();
instrs.add(new Slti(rs, rt, imm));
    } else if (jj_2_13(2)) {
      jj_consume_token(SLTIU);
      rt = get_reg();
      rs = get_reg();
      imm = get_imm();
instrs.add(new Sltiu(rs, rt, imm));
    } else if (jj_2_14(2)) {
      jj_consume_token(SEB);
      rd = get_reg();
      rt = get_reg();
instrs.add(new Seb(rd, rt));
    } else if (jj_2_15(2)) {
      jj_consume_token(SEH);
      rd = get_reg();
      rt = get_reg();
instrs.add(new Seh(rd, rt));
    } else if (jj_2_16(2)) {
      jj_consume_token(AND);
      rd = get_reg();
      rs = get_reg();
      rt = get_reg();
instrs.add(new And(rd, rs, rt));
    } else if (jj_2_17(2)) {
      jj_consume_token(ANDI);
      rt = get_reg();
      rs = get_reg();
      imm = get_imm();
instrs.add(new Andi(rs, rt, imm));
    } else if (jj_2_18(2)) {
      jj_consume_token(LUI);
      rt = get_reg();
      imm = get_imm();
instrs.add(new Lui(rt, imm));
    } else if (jj_2_19(2)) {
      jj_consume_token(NOR);
      rd = get_reg();
      rs = get_reg();
      rt = get_reg();
instrs.add(new Nor(rd, rs, rt));
    } else if (jj_2_20(2)) {
      jj_consume_token(OR);
      rd = get_reg();
      rs = get_reg();
      rt = get_reg();
instrs.add(new Or(rd, rs, rt));
    } else if (jj_2_21(2)) {
      jj_consume_token(ORI);
      rt = get_reg();
      rs = get_reg();
      imm = get_imm();
instrs.add(new Ori(rs, rt, imm));
    } else if (jj_2_22(2)) {
      jj_consume_token(XOR);
      rd = get_reg();
      rs = get_reg();
      rt = get_reg();
instrs.add(new Xor(rd, rs, rt));
    } else if (jj_2_23(2)) {
      jj_consume_token(XORI);
      rt = get_reg();
      rs = get_reg();
      imm = get_imm();
instrs.add(new Xori(rs, rt, imm));
    } else if (jj_2_24(2)) {
      jj_consume_token(SLL);
      rd = get_reg();
      rt = get_reg();
      shamt = get_shamt();
instrs.add(new Sll(rd, rt, shamt));
    } else if (jj_2_25(2)) {
      jj_consume_token(SLLV);
      rd = get_reg();
      rt = get_reg();
      rs = get_reg();
instrs.add(new Sllv(rd, rt, rs));
    } else if (jj_2_26(2)) {
      jj_consume_token(SRA);
      rd = get_reg();
      rt = get_reg();
      shamt = get_shamt();
instrs.add(new Sra(rd, rt, shamt));
    } else if (jj_2_27(2)) {
      jj_consume_token(SRAV);
      rd = get_reg();
      rt = get_reg();
      rs = get_reg();
instrs.add(new Srav(rd, rt, rs));
    } else if (jj_2_28(2)) {
      jj_consume_token(SRL);
      rd = get_reg();
      rt = get_reg();
      shamt = get_shamt();
instrs.add(new Srl(rd, rt, shamt));
    } else if (jj_2_29(2)) {
      jj_consume_token(SRLV);
      rd = get_reg();
      rt = get_reg();
      rs = get_reg();
instrs.add(new Srlv(rd, rt, rs));
    } else if (jj_2_30(2)) {
      jj_consume_token(ROTR);
      rd = get_reg();
      rt = get_reg();
      shamt = get_shamt();
instrs.add(new Rotr(rd, rt, shamt));
    } else if (jj_2_31(2)) {
      jj_consume_token(ROTRV);
      rd = get_reg();
      rt = get_reg();
      rs = get_reg();
instrs.add(new Rotrv(rd, rt, rs));
    } else if (jj_2_32(2)) {
      jj_consume_token(B);
      offset = get_offset();
instrs.add(new B(offset));
    } else if (jj_2_33(2)) {
      jj_consume_token(BAL);
      offset = get_offset();
instrs.add(new Bal(offset));
    } else if (jj_2_34(2)) {
      jj_consume_token(BGEZ);
      rs = get_reg();
      offset = get_offset();
instrs.add(new Bgez(rs, offset));
    } else if (jj_2_35(2)) {
      jj_consume_token(BGTZ);
      rs = get_reg();
      offset = get_offset();
instrs.add(new Bgtz(rs, offset));
    } else if (jj_2_36(2)) {
      jj_consume_token(BGEZAL);
      rs = get_reg();
      offset = get_offset();
instrs.add(new Bgezal(rs, offset));
    } else if (jj_2_37(2)) {
      jj_consume_token(BLEZ);
      rs = get_reg();
      offset = get_offset();
instrs.add(new Blez(rs, offset));
    } else if (jj_2_38(2)) {
      jj_consume_token(BLTZ);
      rs = get_reg();
      offset = get_offset();
instrs.add(new Bltz(rs, offset));
    } else if (jj_2_39(2)) {
      jj_consume_token(BLTZAL);
      rs = get_reg();
      offset = get_offset();
instrs.add(new Bltzal(rs, offset));
    } else if (jj_2_40(2)) {
      jj_consume_token(BEQ);
      rs = get_reg();
      rt = get_reg();
      offset = get_offset();
instrs.add(new Beq(rs,rt,offset));
    } else if (jj_2_41(2)) {
      jj_consume_token(BNE);
      rs = get_reg();
      rt = get_reg();
      offset = get_offset();
instrs.add(new Bne(rs,rt,offset));
    } else if (jj_2_42(2)) {
      jj_consume_token(J);
      target = get_target();
instrs.add(new J(target));
    } else if (jj_2_43(2)) {
      jj_consume_token(JAL);
      target = get_target();
instrs.add(new Jal(target));
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public int get_reg() throws ParseException, ParseException {Token t;
    jj_consume_token(REG_LOGO);
    t = jj_consume_token(INTEGER_LITERAL);
{if ("" != null) return Utils.parseInt(t.image);}
    throw new Error("Missing return statement in function");
  }

  final public int get_target() throws ParseException, ParseException {Token t;
    t = jj_consume_token(INTEGER_LITERAL);
{if ("" != null) return Utils.parseInt(t.image);}
    throw new Error("Missing return statement in function");
  }

  final public short get_imm() throws ParseException, ParseException {Token t;
    t = jj_consume_token(INTEGER_LITERAL);
{if ("" != null) return Utils.parseShort(t.image);}
    throw new Error("Missing return statement in function");
  }

  final public int get_shamt() throws ParseException, ParseException {Token t;
    t = jj_consume_token(INTEGER_LITERAL);
{if ("" != null) return (Utils.parseShort(t.image) & 0x1f);}
    throw new Error("Missing return statement in function");
  }

  final public short get_offset() throws ParseException, ParseException {Token t;
    t = jj_consume_token(INTEGER_LITERAL);
{if ("" != null) return Utils.parseShort(t.image);}
    throw new Error("Missing return statement in function");
  }

  private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_3(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_4(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_5(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_6(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_6(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_7(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_7(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_8(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_8(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_9(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_9(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_10(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_10(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_11(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_11(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_12(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_12(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_13(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_13(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_14(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_14(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_15(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_15(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_16(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_16(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_17(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_17(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_18(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_18(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_19(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_19(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_20(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_20(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_21(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_21(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_22(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_22(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_23(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_23(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_24(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_24(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_25(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_25(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_26(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_26(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_27(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_27(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_28(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_28(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_29(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_29(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_30(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_30(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_31(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_31(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_32(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_32(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_33(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_33(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_34(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_34(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_35(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_35(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_36(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_36(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_37(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_37(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_38(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_38(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_39(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_39(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_40(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_40(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_41(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_41(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_42(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_42(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_43(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_43(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_3_36()
 {
    if (jj_scan_token(BGEZAL)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_35()
 {
    if (jj_scan_token(BGTZ)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_4()
 {
    if (jj_scan_token(ADDI)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_34()
 {
    if (jj_scan_token(BGEZ)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_3()
 {
    if (jj_scan_token(ADD)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_33()
 {
    if (jj_scan_token(BAL)) return true;
    if (jj_3R_4()) return true;
    return false;
  }

  private boolean jj_3R_2()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_2()) {
    jj_scanpos = xsp;
    if (jj_3_3()) {
    jj_scanpos = xsp;
    if (jj_3_4()) {
    jj_scanpos = xsp;
    if (jj_3_5()) {
    jj_scanpos = xsp;
    if (jj_3_6()) {
    jj_scanpos = xsp;
    if (jj_3_7()) {
    jj_scanpos = xsp;
    if (jj_3_8()) {
    jj_scanpos = xsp;
    if (jj_3_9()) {
    jj_scanpos = xsp;
    if (jj_3_10()) {
    jj_scanpos = xsp;
    if (jj_3_11()) {
    jj_scanpos = xsp;
    if (jj_3_12()) {
    jj_scanpos = xsp;
    if (jj_3_13()) {
    jj_scanpos = xsp;
    if (jj_3_14()) {
    jj_scanpos = xsp;
    if (jj_3_15()) {
    jj_scanpos = xsp;
    if (jj_3_16()) {
    jj_scanpos = xsp;
    if (jj_3_17()) {
    jj_scanpos = xsp;
    if (jj_3_18()) {
    jj_scanpos = xsp;
    if (jj_3_19()) {
    jj_scanpos = xsp;
    if (jj_3_20()) {
    jj_scanpos = xsp;
    if (jj_3_21()) {
    jj_scanpos = xsp;
    if (jj_3_22()) {
    jj_scanpos = xsp;
    if (jj_3_23()) {
    jj_scanpos = xsp;
    if (jj_3_24()) {
    jj_scanpos = xsp;
    if (jj_3_25()) {
    jj_scanpos = xsp;
    if (jj_3_26()) {
    jj_scanpos = xsp;
    if (jj_3_27()) {
    jj_scanpos = xsp;
    if (jj_3_28()) {
    jj_scanpos = xsp;
    if (jj_3_29()) {
    jj_scanpos = xsp;
    if (jj_3_30()) {
    jj_scanpos = xsp;
    if (jj_3_31()) {
    jj_scanpos = xsp;
    if (jj_3_32()) {
    jj_scanpos = xsp;
    if (jj_3_33()) {
    jj_scanpos = xsp;
    if (jj_3_34()) {
    jj_scanpos = xsp;
    if (jj_3_35()) {
    jj_scanpos = xsp;
    if (jj_3_36()) {
    jj_scanpos = xsp;
    if (jj_3_37()) {
    jj_scanpos = xsp;
    if (jj_3_38()) {
    jj_scanpos = xsp;
    if (jj_3_39()) {
    jj_scanpos = xsp;
    if (jj_3_40()) {
    jj_scanpos = xsp;
    if (jj_3_41()) {
    jj_scanpos = xsp;
    if (jj_3_42()) {
    jj_scanpos = xsp;
    if (jj_3_43()) return true;
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3_2()
 {
    if (jj_scan_token(NOP)) return true;
    return false;
  }

  private boolean jj_3_32()
 {
    if (jj_scan_token(B)) return true;
    if (jj_3R_4()) return true;
    return false;
  }

  private boolean jj_3_31()
 {
    if (jj_scan_token(ROTRV)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_30()
 {
    if (jj_scan_token(ROTR)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_1()
 {
    if (jj_3R_2()) return true;
    return false;
  }

  private boolean jj_3_29()
 {
    if (jj_scan_token(SRLV)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_28()
 {
    if (jj_scan_token(SRL)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_27()
 {
    if (jj_scan_token(SRAV)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_26()
 {
    if (jj_scan_token(SRA)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3R_4()
 {
    if (jj_scan_token(INTEGER_LITERAL)) return true;
    return false;
  }

  private boolean jj_3_25()
 {
    if (jj_scan_token(SLLV)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_24()
 {
    if (jj_scan_token(SLL)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_23()
 {
    if (jj_scan_token(XORI)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_22()
 {
    if (jj_scan_token(XOR)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_21()
 {
    if (jj_scan_token(ORI)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_20()
 {
    if (jj_scan_token(OR)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_19()
 {
    if (jj_scan_token(NOR)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3R_5()
 {
    if (jj_scan_token(INTEGER_LITERAL)) return true;
    return false;
  }

  private boolean jj_3_18()
 {
    if (jj_scan_token(LUI)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_17()
 {
    if (jj_scan_token(ANDI)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_16()
 {
    if (jj_scan_token(AND)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3R_3()
 {
    if (jj_scan_token(REG_LOGO)) return true;
    return false;
  }

  private boolean jj_3_15()
 {
    if (jj_scan_token(SEH)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_14()
 {
    if (jj_scan_token(SEB)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_13()
 {
    if (jj_scan_token(SLTIU)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_43()
 {
    if (jj_scan_token(JAL)) return true;
    if (jj_3R_5()) return true;
    return false;
  }

  private boolean jj_3_12()
 {
    if (jj_scan_token(SLTI)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_42()
 {
    if (jj_scan_token(J)) return true;
    if (jj_3R_5()) return true;
    return false;
  }

  private boolean jj_3_11()
 {
    if (jj_scan_token(SLT)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_41()
 {
    if (jj_scan_token(BNE)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_10()
 {
    if (jj_scan_token(CLZ)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_40()
 {
    if (jj_scan_token(BEQ)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_8()
 {
    if (jj_scan_token(SUBU)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_9()
 {
    if (jj_scan_token(CLO)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_39()
 {
    if (jj_scan_token(BLTZAL)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_38()
 {
    if (jj_scan_token(BLTZ)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_6()
 {
    if (jj_scan_token(ADDU)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_7()
 {
    if (jj_scan_token(SUB)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_37()
 {
    if (jj_scan_token(BLEZ)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  private boolean jj_3_5()
 {
    if (jj_scan_token(ADDIU)) return true;
    if (jj_3R_3()) return true;
    return false;
  }

  /** Generated Token Manager. */
  public MIPSParserTokenManager token_source;
  JavaCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;

  /** Constructor with InputStream. */
  public MIPSParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public MIPSParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new MIPSParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
  }

  /** Constructor. */
  public MIPSParser(java.io.Reader stream) {
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new MIPSParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
  }

  /** Constructor with generated Token Manager. */
  public MIPSParser(MIPSParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
  }

  /** Reinitialise. */
  public void ReInit(MIPSParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      return token;
    }
    token = oldToken;
    throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    Token errortok = token.next;
    int line = errortok.beginLine, column = errortok.beginColumn;
    String mess = (errortok.kind == 0) ? tokenImage[0] : errortok.image;
    return new ParseException("Parse error at line " + line + ", column " + column + ".  Encountered: " + mess);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}