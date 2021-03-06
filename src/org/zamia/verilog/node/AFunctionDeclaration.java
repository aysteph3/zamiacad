/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import java.util.*;
import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AFunctionDeclaration extends PFunctionDeclaration
{
    private TKFunction _kFunction_;
    private TKAutomatic _kAutomatic_;
    private PFunctionRangeOrType _functionRangeOrType_;
    private PIdentifier _identifier_;
    private PFunctionDeclarationL _functionDeclarationL_;
    private TTSemicolon _tSemicolon_;
    private final LinkedList<PFunctionItemDeclaration> _functionItemDeclaration_ = new LinkedList<PFunctionItemDeclaration>();
    private PStatement _statement_;
    private TKEndfunction _kEndfunction_;

    public AFunctionDeclaration()
    {
        // Constructor
    }

    public AFunctionDeclaration(
        @SuppressWarnings("hiding") TKFunction _kFunction_,
        @SuppressWarnings("hiding") TKAutomatic _kAutomatic_,
        @SuppressWarnings("hiding") PFunctionRangeOrType _functionRangeOrType_,
        @SuppressWarnings("hiding") PIdentifier _identifier_,
        @SuppressWarnings("hiding") PFunctionDeclarationL _functionDeclarationL_,
        @SuppressWarnings("hiding") TTSemicolon _tSemicolon_,
        @SuppressWarnings("hiding") List<PFunctionItemDeclaration> _functionItemDeclaration_,
        @SuppressWarnings("hiding") PStatement _statement_,
        @SuppressWarnings("hiding") TKEndfunction _kEndfunction_)
    {
        // Constructor
        setKFunction(_kFunction_);

        setKAutomatic(_kAutomatic_);

        setFunctionRangeOrType(_functionRangeOrType_);

        setIdentifier(_identifier_);

        setFunctionDeclarationL(_functionDeclarationL_);

        setTSemicolon(_tSemicolon_);

        setFunctionItemDeclaration(_functionItemDeclaration_);

        setStatement(_statement_);

        setKEndfunction(_kEndfunction_);

    }

    @Override
    public Object clone()
    {
        return new AFunctionDeclaration(
            cloneNode(this._kFunction_),
            cloneNode(this._kAutomatic_),
            cloneNode(this._functionRangeOrType_),
            cloneNode(this._identifier_),
            cloneNode(this._functionDeclarationL_),
            cloneNode(this._tSemicolon_),
            cloneList(this._functionItemDeclaration_),
            cloneNode(this._statement_),
            cloneNode(this._kEndfunction_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunctionDeclaration(this);
    }

    public TKFunction getKFunction()
    {
        return this._kFunction_;
    }

    public void setKFunction(TKFunction node)
    {
        if(this._kFunction_ != null)
        {
            this._kFunction_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kFunction_ = node;
    }

    public TKAutomatic getKAutomatic()
    {
        return this._kAutomatic_;
    }

    public void setKAutomatic(TKAutomatic node)
    {
        if(this._kAutomatic_ != null)
        {
            this._kAutomatic_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kAutomatic_ = node;
    }

    public PFunctionRangeOrType getFunctionRangeOrType()
    {
        return this._functionRangeOrType_;
    }

    public void setFunctionRangeOrType(PFunctionRangeOrType node)
    {
        if(this._functionRangeOrType_ != null)
        {
            this._functionRangeOrType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._functionRangeOrType_ = node;
    }

    public PIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(PIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public PFunctionDeclarationL getFunctionDeclarationL()
    {
        return this._functionDeclarationL_;
    }

    public void setFunctionDeclarationL(PFunctionDeclarationL node)
    {
        if(this._functionDeclarationL_ != null)
        {
            this._functionDeclarationL_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._functionDeclarationL_ = node;
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

    public LinkedList<PFunctionItemDeclaration> getFunctionItemDeclaration()
    {
        return this._functionItemDeclaration_;
    }

    public void setFunctionItemDeclaration(List<PFunctionItemDeclaration> list)
    {
        this._functionItemDeclaration_.clear();
        this._functionItemDeclaration_.addAll(list);
        for(PFunctionItemDeclaration e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public PStatement getStatement()
    {
        return this._statement_;
    }

    public void setStatement(PStatement node)
    {
        if(this._statement_ != null)
        {
            this._statement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._statement_ = node;
    }

    public TKEndfunction getKEndfunction()
    {
        return this._kEndfunction_;
    }

    public void setKEndfunction(TKEndfunction node)
    {
        if(this._kEndfunction_ != null)
        {
            this._kEndfunction_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kEndfunction_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kFunction_)
            + toString(this._kAutomatic_)
            + toString(this._functionRangeOrType_)
            + toString(this._identifier_)
            + toString(this._functionDeclarationL_)
            + toString(this._tSemicolon_)
            + toString(this._functionItemDeclaration_)
            + toString(this._statement_)
            + toString(this._kEndfunction_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kFunction_ == child)
        {
            this._kFunction_ = null;
            return;
        }

        if(this._kAutomatic_ == child)
        {
            this._kAutomatic_ = null;
            return;
        }

        if(this._functionRangeOrType_ == child)
        {
            this._functionRangeOrType_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._functionDeclarationL_ == child)
        {
            this._functionDeclarationL_ = null;
            return;
        }

        if(this._tSemicolon_ == child)
        {
            this._tSemicolon_ = null;
            return;
        }

        if(this._functionItemDeclaration_.remove(child))
        {
            return;
        }

        if(this._statement_ == child)
        {
            this._statement_ = null;
            return;
        }

        if(this._kEndfunction_ == child)
        {
            this._kEndfunction_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kFunction_ == oldChild)
        {
            setKFunction((TKFunction) newChild);
            return;
        }

        if(this._kAutomatic_ == oldChild)
        {
            setKAutomatic((TKAutomatic) newChild);
            return;
        }

        if(this._functionRangeOrType_ == oldChild)
        {
            setFunctionRangeOrType((PFunctionRangeOrType) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((PIdentifier) newChild);
            return;
        }

        if(this._functionDeclarationL_ == oldChild)
        {
            setFunctionDeclarationL((PFunctionDeclarationL) newChild);
            return;
        }

        if(this._tSemicolon_ == oldChild)
        {
            setTSemicolon((TTSemicolon) newChild);
            return;
        }

        for(ListIterator<PFunctionItemDeclaration> i = this._functionItemDeclaration_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PFunctionItemDeclaration) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._statement_ == oldChild)
        {
            setStatement((PStatement) newChild);
            return;
        }

        if(this._kEndfunction_ == oldChild)
        {
            setKEndfunction((TKEndfunction) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
