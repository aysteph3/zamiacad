/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP7StatementWithoutTrailingSubstatement extends PStatementWithoutTrailingSubstatement
{
    private PProceduralContinuousAssignments _proceduralContinuousAssignments_;
    private TTSemicolon _tSemicolon_;

    public AP7StatementWithoutTrailingSubstatement()
    {
        // Constructor
    }

    public AP7StatementWithoutTrailingSubstatement(
        @SuppressWarnings("hiding") PProceduralContinuousAssignments _proceduralContinuousAssignments_,
        @SuppressWarnings("hiding") TTSemicolon _tSemicolon_)
    {
        // Constructor
        setProceduralContinuousAssignments(_proceduralContinuousAssignments_);

        setTSemicolon(_tSemicolon_);

    }

    @Override
    public Object clone()
    {
        return new AP7StatementWithoutTrailingSubstatement(
            cloneNode(this._proceduralContinuousAssignments_),
            cloneNode(this._tSemicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP7StatementWithoutTrailingSubstatement(this);
    }

    public PProceduralContinuousAssignments getProceduralContinuousAssignments()
    {
        return this._proceduralContinuousAssignments_;
    }

    public void setProceduralContinuousAssignments(PProceduralContinuousAssignments node)
    {
        if(this._proceduralContinuousAssignments_ != null)
        {
            this._proceduralContinuousAssignments_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._proceduralContinuousAssignments_ = node;
    }

    public TTSemicolon getTSemicolon()
    {
        return this._tSemicolon_;
    }

    public void setTSemicolon(TTSemicolon node)
    {
        if(this._tSemicolon_ != null)
        {
            this._tSemicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tSemicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._proceduralContinuousAssignments_)
            + toString(this._tSemicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._proceduralContinuousAssignments_ == child)
        {
            this._proceduralContinuousAssignments_ = null;
            return;
        }

        if(this._tSemicolon_ == child)
        {
            this._tSemicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._proceduralContinuousAssignments_ == oldChild)
        {
            setProceduralContinuousAssignments((PProceduralContinuousAssignments) newChild);
            return;
        }

        if(this._tSemicolon_ == oldChild)
        {
            setTSemicolon((TTSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}