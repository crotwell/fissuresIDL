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

package edu.iris.Fissures.IfNetwork;

//
// IDL:iris.edu/Fissures/IfNetwork/NetworkDC:1.0
//
public class NetworkDCPOATie extends NetworkDCPOA
{
    private NetworkDCOperations _ob_delegate_;
    private org.omg.PortableServer.POA _ob_poa_;

    public
    NetworkDCPOATie(NetworkDCOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public
    NetworkDCPOATie(NetworkDCOperations delegate, org.omg.PortableServer.POA poa)
    {
        _ob_delegate_ = delegate;
        _ob_poa_ = poa;
    }

    public NetworkDCOperations
    _delegate()
    {
        return _ob_delegate_;
    }

    public void
    _delegate(NetworkDCOperations delegate)
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
    // IDL:iris.edu/Fissures/IfNetwork/NetworkDC/a_explorer:1.0
    //
    public NetworkExplorer
    a_explorer()
    {
        return _ob_delegate_.a_explorer();
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkDC/a_finder:1.0
    //
    public NetworkFinder
    a_finder()
    {
        return _ob_delegate_.a_finder();
    }
}