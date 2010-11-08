/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;
import org.zamia.SourceFile;

@SuppressWarnings("nls")
public final class TKEndcase extends Token
{
    public TKEndcase(int line, int pos, SourceFile sf)
    {
        super ("endcase", line, pos, sf);
    }

    @Override
    public Object clone()
    {
      return new TKEndcase(getLine(), getPos(), getSource());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKEndcase(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKEndcase text.");
    }
}