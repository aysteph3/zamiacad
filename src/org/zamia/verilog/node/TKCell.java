/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;
import org.zamia.SourceFile;

@SuppressWarnings("nls")
public final class TKCell extends Token
{
    public TKCell(int line, int pos, SourceFile sf)
    {
        super ("cell", line, pos, sf);
    }

    @Override
    public Object clone()
    {
      return new TKCell(getLine(), getPos(), getSource());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKCell(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKCell text.");
    }
}
