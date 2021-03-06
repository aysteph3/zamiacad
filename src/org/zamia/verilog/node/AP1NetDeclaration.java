/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP1NetDeclaration extends PNetDeclaration
{
    private PNetType _netType_;
    private PDriveStrength _driveStrength_;
    private TKSigned _kSigned_;
    private PDelay3 _delay3_;
    private PListOfNetDeclAssignments _listOfNetDeclAssignments_;
    private TTSemicolon _tSemicolon_;

    public AP1NetDeclaration()
    {
        // Constructor
    }

    public AP1NetDeclaration(
        @SuppressWarnings("hiding") PNetType _netType_,
        @SuppressWarnings("hiding") PDriveStrength _driveStrength_,
        @SuppressWarnings("hiding") TKSigned _kSigned_,
        @SuppressWarnings("hiding") PDelay3 _delay3_,
        @SuppressWarnings("hiding") PListOfNetDeclAssignments _listOfNetDeclAssignments_,
        @SuppressWarnings("hiding") TTSemicolon _tSemicolon_)
    {
        // Constructor
        setNetType(_netType_);

        setDriveStrength(_driveStrength_);

        setKSigned(_kSigned_);

        setDelay3(_delay3_);

        setListOfNetDeclAssignments(_listOfNetDeclAssignments_);

        setTSemicolon(_tSemicolon_);

    }

    @Override
    public Object clone()
    {
        return new AP1NetDeclaration(
            cloneNode(this._netType_),
            cloneNode(this._driveStrength_),
            cloneNode(this._kSigned_),
            cloneNode(this._delay3_),
            cloneNode(this._listOfNetDeclAssignments_),
            cloneNode(this._tSemicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP1NetDeclaration(this);
    }

    public PNetType getNetType()
    {
        return this._netType_;
    }

    public void setNetType(PNetType node)
    {
        if(this._netType_ != null)
        {
            this._netType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._netType_ = node;
    }

    public PDriveStrength getDriveStrength()
    {
        return this._driveStrength_;
    }

    public void setDriveStrength(PDriveStrength node)
    {
        if(this._driveStrength_ != null)
        {
            this._driveStrength_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._driveStrength_ = node;
    }

    public TKSigned getKSigned()
    {
        return this._kSigned_;
    }

    public void setKSigned(TKSigned node)
    {
        if(this._kSigned_ != null)
        {
            this._kSigned_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kSigned_ = node;
    }

    public PDelay3 getDelay3()
    {
        return this._delay3_;
    }

    public void setDelay3(PDelay3 node)
    {
        if(this._delay3_ != null)
        {
            this._delay3_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._delay3_ = node;
    }

    public PListOfNetDeclAssignments getListOfNetDeclAssignments()
    {
        return this._listOfNetDeclAssignments_;
    }

    public void setListOfNetDeclAssignments(PListOfNetDeclAssignments node)
    {
        if(this._listOfNetDeclAssignments_ != null)
        {
            this._listOfNetDeclAssignments_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listOfNetDeclAssignments_ = node;
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
            + toString(this._netType_)
            + toString(this._driveStrength_)
            + toString(this._kSigned_)
            + toString(this._delay3_)
            + toString(this._listOfNetDeclAssignments_)
            + toString(this._tSemicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._netType_ == child)
        {
            this._netType_ = null;
            return;
        }

        if(this._driveStrength_ == child)
        {
            this._driveStrength_ = null;
            return;
        }

        if(this._kSigned_ == child)
        {
            this._kSigned_ = null;
            return;
        }

        if(this._delay3_ == child)
        {
            this._delay3_ = null;
            return;
        }

        if(this._listOfNetDeclAssignments_ == child)
        {
            this._listOfNetDeclAssignments_ = null;
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
        if(this._netType_ == oldChild)
        {
            setNetType((PNetType) newChild);
            return;
        }

        if(this._driveStrength_ == oldChild)
        {
            setDriveStrength((PDriveStrength) newChild);
            return;
        }

        if(this._kSigned_ == oldChild)
        {
            setKSigned((TKSigned) newChild);
            return;
        }

        if(this._delay3_ == oldChild)
        {
            setDelay3((PDelay3) newChild);
            return;
        }

        if(this._listOfNetDeclAssignments_ == oldChild)
        {
            setListOfNetDeclAssignments((PListOfNetDeclAssignments) newChild);
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
