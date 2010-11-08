/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;
import org.zamia.SourceFile;

@SuppressWarnings("nls")
public final class TKSqrt extends Token
{
    public TKSqrt(int line, int pos, SourceFile sf)
    {
        super ("sqrt", line, pos, sf);
    }

    @Override
    public Object clone()
    {
      return new TKSqrt(getLine(), getPos(), getSource());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKSqrt(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKSqrt text.");
    }
}