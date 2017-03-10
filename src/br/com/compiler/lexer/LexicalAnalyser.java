package br.com.compiler.lexer;

import org.antlr.runtime.RuleReturnScope;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pedro Mutter on 19/10/16.
 */
public class LexicalAnalyser {
    public static void main (String... args) throws IOException {
        String file = "/root/IdeaProjects/CMinusCompiler/res/IMC.cm";
        CharStream cs = new ANTLRFileStream(file);
        CMinusLexer lexer = new CMinusLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CMinusParser parser = new CMinusParser(tokens);
        ParseTree tree = parser.program();

        try {
            CMinusBaseVisitor cMinusBaseVisitor = new CMinusBaseVisitor();
            cMinusBaseVisitor.visit(tree);
            cMinusBaseVisitor.printTable();
            cMinusBaseVisitor.printThreeAddressCode();
        } catch (Exception e){
            e.printStackTrace();
        }

        /*for(Token token : tokens.getTokens()){
            System.out.println(token.toString());
        }

        List<TerminalNode> terminalNodes = new ArrayList<TerminalNode>();
        for (int i = 0; i < tree.getChildCount(); i++) {
            if (tree.getChild(i) instanceof TerminalNode) {
                terminalNodes.add((TerminalNode)tree.getChild(i));
            }
        }
        System.out.println(terminalNodes);*/

    }
}
