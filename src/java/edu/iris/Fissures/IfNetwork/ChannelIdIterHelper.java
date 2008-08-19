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
// IDL:iris.edu/Fissures/IfNetwork/ChannelIdIter:1.0
//
final public class ChannelIdIterHelper
{
    public static void
    insert(org.omg.CORBA.Any any, ChannelIdIter val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static ChannelIdIter
    extract(org.omg.CORBA.Any any)
    {
        if(any.type().equivalent(type()))
            return read(any.create_input_stream());
        else
            throw new org.omg.CORBA.BAD_OPERATION();
    }

    private static org.omg.CORBA.TypeCode typeCode_;

    public static org.omg.CORBA.TypeCode
    type()
    {
        if(typeCode_ == null)
        {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            typeCode_ = orb.create_interface_tc(id(), "ChannelIdIter");
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfNetwork/ChannelIdIter:1.0";
    }

    public static ChannelIdIter
    read(org.omg.CORBA.portable.InputStream in)
    {
        org.omg.CORBA.Object _ob_v = in.read_Object();
        if(_ob_v == null)
            return null;

        try
        {
            return (ChannelIdIter)_ob_v;
        }
        catch(ClassCastException ex)
        {
        }

        org.omg.CORBA.portable.ObjectImpl _ob_impl;
        _ob_impl = (org.omg.CORBA.portable.ObjectImpl)_ob_v;
        _ChannelIdIterStub _ob_stub = new _ChannelIdIterStub();
        _ob_stub._set_delegate(_ob_impl._get_delegate());
        return _ob_stub;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, ChannelIdIter val)
    {
        out.write_Object(val);
    }

    public static ChannelIdIter
    narrow(org.omg.CORBA.Object val)
    {
        if(val != null)
        {
            try
            {
                return (ChannelIdIter)val;
            }
            catch(ClassCastException ex)
            {
            }

            if(val._is_a(id()))
            {
                org.omg.CORBA.portable.ObjectImpl _ob_impl;
                _ChannelIdIterStub _ob_stub = new _ChannelIdIterStub();
                _ob_impl = (org.omg.CORBA.portable.ObjectImpl)val;
                _ob_stub._set_delegate(_ob_impl._get_delegate());
                return _ob_stub;
            }

            throw new org.omg.CORBA.BAD_PARAM();
        }

        return null;
    }
}
