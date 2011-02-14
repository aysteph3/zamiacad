/* 
 * Copyright 2010 by the authors indicated in the @author tags. 
 * All rights reserved. 
 * 
 * See the LICENSE file for details.
 * 
 * Created by Guenter Bartsch on Dec 10, 2010
 */
package org.zamia.rtlng;

import org.zamia.rtlng.RTLType.TypeCat;
import org.zamia.rtlng.nodes.RTLNBinaryOp;
import org.zamia.rtlng.nodes.RTLNLiteral;
import org.zamia.rtlng.nodes.RTLNUnaryOp;
import org.zamia.rtlng.symbols.RTLSymbolBinaryLogic;
import org.zamia.rtlng.symbols.RTLSymbolLiteral;
import org.zamia.rtlng.symbols.RTLSymbolUnaryLogic;
import org.zamia.vg.VGLabelProvider;
import org.zamia.vg.VGLayout;
import org.zamia.vg.VGSymbol;

/**
 * 
 * @author Guenter Bartsch
 *
 */

public class RTLVisualGraphLabelProvider implements VGLabelProvider<RTLNode, RTLPort, RTLSignal> {

	private static final int SIGNAL_WIDTH_BIT = 1;

	private static final int SIGNAL_WIDTH_BUS = 4;

	private static final int PORT_WIDTH_BIT = 1;

	private static final int PORT_WIDTH_BUS = 4;

	public RTLVisualGraphLabelProvider(RTLModule aModule) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public VGSymbol<RTLNode, RTLPort, RTLSignal> getNodeSymbol(RTLNode aNode, VGLayout<RTLNode, RTLPort, RTLSignal> aLayout) {

		if (aNode instanceof RTLNLiteral) {
			return new RTLSymbolLiteral((RTLNLiteral) aNode, aLayout.getGC());
		} else if (aNode instanceof RTLNBinaryOp) {
			
			RTLNBinaryOp bop = (RTLNBinaryOp) aNode;
			
			RTLType type = bop.getType();
			if (type.getCat() == TypeCat.BIT) {
				return new RTLSymbolBinaryLogic(bop, aLayout.getGC());
			}
		} else if (aNode instanceof RTLNUnaryOp) {
			RTLNUnaryOp uop = (RTLNUnaryOp) aNode;
			
			RTLType type = uop.getType();
			if (type.getCat() == TypeCat.BIT) {
				return new RTLSymbolUnaryLogic(uop, aLayout.getGC());
			}
			
		}

		return null;
	}

	@Override
	public String getNodeLabel(RTLNode aNode) {
		return aNode.getInstanceName();
	}

	@Override
	public String getSignalLabel(RTLSignal aSignal) {
		return aSignal.getId();
	}

	@Override
	public String getPortLabel(RTLPort aPort) {
		return aPort.getId();
	}

	@Override
	public int getSignalWidth(RTLSignal aSignal) {
		switch (aSignal.getType().getCat()) {
		case BIT:
			return SIGNAL_WIDTH_BIT;
		default:
			return SIGNAL_WIDTH_BUS;
		}
	}

	@Override
	public int getPortWidth(RTLPort aPort) {
		switch (aPort.getType().getCat()) {
		case BIT:
			return PORT_WIDTH_BIT;
		default:
			return PORT_WIDTH_BUS;
		}
	}

}