/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;
import org.zamia.SourceFile;

@SuppressWarnings("nls")
public final class TKRtranif0 extends Token
{
    public TKRtranif0(int line, int pos, SourceFile sf)
    {
        super ("rtranif0", line, pos, sf);
    }

    @Override
    public Object clone()
    {
      return new TKRtranif0(getLine(), getPos(), getSource());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKRtranif0(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKRtranif0 text.");
    }
}
