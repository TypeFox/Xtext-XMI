/*
 * generated by Xtext 2.12.0
 */
grammar InternalXtree;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package io.typefox.xtextxmi.xtree.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package io.typefox.xtextxmi.xtree.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import io.typefox.xtextxmi.xtree.services.XtreeGrammarAccess;

}
@parser::members {
	private XtreeGrammarAccess grammarAccess;

	public void setGrammarAccess(XtreeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleNode
entryRuleNode
:
{ before(grammarAccess.getNodeRule()); }
	 ruleNode
{ after(grammarAccess.getNodeRule()); } 
	 EOF 
;

// Rule Node
ruleNode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNodeAccess().getGroup()); }
		(rule__Node__Group__0)
		{ after(grammarAccess.getNodeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
		(rule__QualifiedName__Group__0)
		{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__0__Impl
	rule__Node__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getNameAssignment_0()); }
	(rule__Node__NameAssignment_0)
	{ after(grammarAccess.getNodeAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getGroup_1()); }
	(rule__Node__Group_1__0)?
	{ after(grammarAccess.getNodeAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_1__0__Impl
	rule__Node__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getLeftParenthesisKeyword_1_0()); }
	'('
	{ after(grammarAccess.getNodeAccess().getLeftParenthesisKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_1__1__Impl
	rule__Node__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getGroup_1_1()); }
	(rule__Node__Group_1_1__0)?
	{ after(grammarAccess.getNodeAccess().getGroup_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_1__2__Impl
	rule__Node__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getGroup_1_2()); }
	(rule__Node__Group_1_2__0)?
	{ after(grammarAccess.getNodeAccess().getGroup_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getRightParenthesisKeyword_1_3()); }
	')'
	{ after(grammarAccess.getNodeAccess().getRightParenthesisKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_1_1__0__Impl
	rule__Node__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getRelatedKeyword_1_1_0()); }
	'related'
	{ after(grammarAccess.getNodeAccess().getRelatedKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getRelatedAssignment_1_1_1()); }
	(rule__Node__RelatedAssignment_1_1_1)*
	{ after(grammarAccess.getNodeAccess().getRelatedAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_1_2__0__Impl
	rule__Node__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getChildrenKeyword_1_2_0()); }
	'children'
	{ after(grammarAccess.getNodeAccess().getChildrenKeyword_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getChildrenAssignment_1_2_1()); }
	(rule__Node__ChildrenAssignment_1_2_1)*
	{ after(grammarAccess.getNodeAccess().getChildrenAssignment_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
	(rule__QualifiedName__Group_1__0)*
	{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Node__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__RelatedAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getRelatedNodeCrossReference_1_1_1_0()); }
		(
			{ before(grammarAccess.getNodeAccess().getRelatedNodeQualifiedNameParserRuleCall_1_1_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getNodeAccess().getRelatedNodeQualifiedNameParserRuleCall_1_1_1_0_1()); }
		)
		{ after(grammarAccess.getNodeAccess().getRelatedNodeCrossReference_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__ChildrenAssignment_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getChildrenNodeParserRuleCall_1_2_1_0()); }
		ruleNode
		{ after(grammarAccess.getNodeAccess().getChildrenNodeParserRuleCall_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
