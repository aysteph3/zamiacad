/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;
import org.zamia.SourceFile;

@SuppressWarnings("nls")
public final class TKXor extends Token
{
    public TKXor(int line, int pos, SourceFile sf)
    {
        super ("xor", line, pos, sf);
    }

    @Override
    public Object clone()
    {
      return new TKXor(getLine(), getPos(), getSource());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKXor(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKXor text.");
    }
}
