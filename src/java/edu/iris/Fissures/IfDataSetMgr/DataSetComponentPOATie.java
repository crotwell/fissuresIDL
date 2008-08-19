// **********************************************************************
//
// Generated by the ORBacus IDL to Java Translator
//
// Copyright (c) 2000
// Object Oriented Concepts, Inc.
// Billerica, MA, USA
//
// All Rights Reserved
//
// **********************************************************************

// Version: 4.0.5

package edu.iris.Fissures.IfDataSetMgr;

//
// IDL:iris.edu/Fissures/IfDataSetMgr/DataSetComponent:1.0
//
public class DataSetComponentPOATie extends DataSetComponentPOA
{
    private DataSetComponentOperations _ob_delegate_;
    private org.omg.PortableServer.POA _ob_poa_;

    public
    DataSetComponentPOATie(DataSetComponentOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public
    DataSetComponentPOATie(DataSetComponentOperations delegate, org.omg.PortableServer.POA poa)
    {
        _ob_delegate_ = delegate;
        _ob_poa_ = poa;
    }

    public DataSetComponentOperations
    _delegate()
    {
        return _ob_delegate_;
    }

    public void
    _delegate(DataSetComponentOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public org.omg.PortableServer.POA
    _default_POA()
    {
        if(_ob_poa_ != null)
            return _ob_poa_;
        else
            return super._default_POA();
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetComponent/a_finder:1.0
    //
    public DataSetFinder
    a_finder()
    {
        return _ob_delegate_.a_finder();
    }

    //
    // IDL:iris.edu/Fissures/IfDataSetMgr/DataSetComponent/a_factory:1.0
    //
    public DataSetFactory
    a_factory()
    {
        return _ob_delegate_.a_factory();
    }
}
