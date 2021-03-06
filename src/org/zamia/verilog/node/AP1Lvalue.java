/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import java.util.*;
import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP1Lvalue extends PLvalue
{
    private TTLbrace _tLbrace_;
    private PLvalue _lvalue_;
    private final LinkedList<PLvalueRep2> _lvalueRep2_ = new LinkedList<PLvalueRep2>();
    private TTRbrace _tRbrace_;

    public AP1Lvalue()
    {
        // Constructor
    }

    public AP1Lvalue(
        @SuppressWarnings("hiding") TTLbrace _tLbrace_,
        @SuppressWarnings("hiding") PLvalue _lvalue_,
        @SuppressWarnings("hiding") List<PLvalueRep2> _lvalueRep2_,
        @SuppressWarnings("hiding") TTRbrace _tRbrace_)
    {
        // Constructor
        setTLbrace(_tLbrace_);

        setLvalue(_lvalue_);

        setLvalueRep2(_lvalueRep2_);

        setTRbrace(_tRbrace_);

    }

    @Override
    public Object clone()
    {
        return new AP1Lvalue(
            cloneNode(this._tLbrace_),
            cloneNode(this._lvalue_),
            cloneList(this._lvalueRep2_),
            cloneNode(this._tRbrace_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP1Lvalue(this);
    }

    public TTLbrace getTLbrace()
    {
        return this._tLbrace_;
    }

    public void setTLbrace(TTLbrace node)
    {
        if(this._tLbrace_ != null)
        {
            this._tLbrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tLbrace_ = node;
    }

    public PLvalue getLvalue()
    {
        return this._lvalue_;
    }

    public void setLvalue(PLvalue node)
    {
        if(this._lvalue_ != null)
        {
            this._lvalue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lvalue_ = node;
    }

    public LinkedList<PLvalueRep2> getLvalueRep2()
    {
        return this._lvalueRep2_;
    }

    public void setLvalueRep2(List<PLvalueRep2> list)
    {
        this._lvalueRep2_.clear();
        this._lvalueRep2_.addAll(list);
        for(PLvalueRep2 e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public TTRbrace getTRbrace()
    {
        return this._tRbrace_;
    }

    public void setTRbrace(TTRbrace node)
    {
        if(this._tRbrace_ != null)
        {
            this._tRbrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tRbrace_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tLbrace_)
            + toString(this._lvalue_)
            + toString(this._lvalueRep2_)
            + toString(this._tRbrace_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tLbrace_ == child)
        {
            this._tLbrace_ = null;
            return;
        }

        if(this._lvalue_ == child)
        {
            this._lvalue_ = null;
            return;
        }

        if(this._lvalueRep2_.remove(child))
        {
            return;
        }

        if(this._tRbrace_ == child)
        {
            this._tRbrace_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tLbrace_ == oldChild)
        {
            setTLbrace((TTLbrace) newChild);
            return;
        }

        if(this._lvalue_ == oldChild)
        {
            setLvalue((PLvalue) newChild);
            return;
        }

        for(ListIterator<PLvalueRep2> i = this._lvalueRep2_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PLvalueRep2) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._tRbrace_ == oldChild)
        {
            setTRbrace((TTRbrace) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
