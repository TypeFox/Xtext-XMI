/*
 * generated by Xtext 2.12.0
 */
package io.typefox.xtextxmi.xtree.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class XtreeAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("io/typefox/xtextxmi/xtree/parser/antlr/internal/InternalXtree.tokens");
	}
}
