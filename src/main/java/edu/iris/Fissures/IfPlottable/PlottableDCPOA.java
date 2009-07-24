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

package edu.iris.Fissures.IfPlottable;

//
// IDL:iris.edu/Fissures/IfPlottable/PlottableDC:1.0
//
public abstract class PlottableDCPOA
    extends org.omg.PortableServer.Servant
    implements org.omg.CORBA.portable.InvokeHandler,
               PlottableDCOperations
{
    static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfPlottable/PlottableDC:1.0",
    };

    public PlottableDC
    _this()
    {
        return PlottableDCHelper.narrow(super._this_object());
    }

    public PlottableDC
    _this(org.omg.CORBA.ORB orb)
    {
        return PlottableDCHelper.narrow(super._this_object(orb));
    }

    public String[]
    _all_interfaces(org.omg.PortableServer.POA poa, byte[] objectId)
    {
        return _ob_ids_;
    }

    public org.omg.CORBA.portable.OutputStream
    _invoke(String opName,
            org.omg.CORBA.portable.InputStream in,
            org.omg.CORBA.portable.ResponseHandler handler)
    {
        final String[] _ob_names =
        {
            "custom_sizes",
            "get_event_sizes",
            "get_for_day",
            "get_for_event",
            "get_plottable",
            "get_whole_day_sizes"
        };

        int _ob_left = 0;
        int _ob_right = _ob_names.length;
        int _ob_index = -1;

        while(_ob_left < _ob_right)
        {
            int _ob_m = (_ob_left + _ob_right) / 2;
            int _ob_res = _ob_names[_ob_m].compareTo(opName);
            if(_ob_res == 0)
            {
                _ob_index = _ob_m;
                break;
            }
            else if(_ob_res > 0)
                _ob_right = _ob_m;
            else
                _ob_left = _ob_m + 1;
        }

        switch(_ob_index)
        {
        case 0: // custom_sizes
            return _OB_op_custom_sizes(in, handler);

        case 1: // get_event_sizes
            return _OB_op_get_event_sizes(in, handler);

        case 2: // get_for_day
            return _OB_op_get_for_day(in, handler);

        case 3: // get_for_event
            return _OB_op_get_for_event(in, handler);

        case 4: // get_plottable
            return _OB_op_get_plottable(in, handler);

        case 5: // get_whole_day_sizes
            return _OB_op_get_whole_day_sizes(in, handler);
        }

        throw new org.omg.CORBA.BAD_OPERATION();
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_custom_sizes(org.omg.CORBA.portable.InputStream in,
                        org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        boolean _ob_r = custom_sizes();
        out = handler.createReply();
        out.write_boolean(_ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_event_sizes(org.omg.CORBA.portable.InputStream in,
                           org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        edu.iris.Fissures.Dimension[] _ob_r = get_event_sizes();
        out = handler.createReply();
        edu.iris.Fissures.DimensionSeqHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_for_day(org.omg.CORBA.portable.InputStream in,
                       org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            edu.iris.Fissures.IfNetwork.ChannelId _ob_a0 = edu.iris.Fissures.IfNetwork.ChannelIdHelper.read(in);
            int _ob_a1 = in.read_long();
            int _ob_a2 = in.read_long();
            edu.iris.Fissures.Dimension _ob_a3 = edu.iris.Fissures.DimensionHelper.read(in);
            edu.iris.Fissures.Plottable[] _ob_r = get_for_day(_ob_a0, _ob_a1, _ob_a2, _ob_a3);
            out = handler.createReply();
            edu.iris.Fissures.PlottableSeqHelper.write(out, _ob_r);
        }
        catch(PlottableNotAvailable _ob_ex)
        {
            out = handler.createExceptionReply();
            PlottableNotAvailableHelper.write(out, _ob_ex);
        }
        catch(UnsupportedDimension _ob_ex)
        {
            out = handler.createExceptionReply();
            UnsupportedDimensionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_for_event(org.omg.CORBA.portable.InputStream in,
                         org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            edu.iris.Fissures.IfEvent.EventAccess _ob_a0 = edu.iris.Fissures.IfEvent.EventAccessHelper.read(in);
            edu.iris.Fissures.IfNetwork.ChannelId _ob_a1 = edu.iris.Fissures.IfNetwork.ChannelIdHelper.read(in);
            edu.iris.Fissures.Dimension _ob_a2 = edu.iris.Fissures.DimensionHelper.read(in);
            edu.iris.Fissures.Plottable[] _ob_r = get_for_event(_ob_a0, _ob_a1, _ob_a2);
            out = handler.createReply();
            edu.iris.Fissures.PlottableSeqHelper.write(out, _ob_r);
        }
        catch(PlottableNotAvailable _ob_ex)
        {
            out = handler.createExceptionReply();
            PlottableNotAvailableHelper.write(out, _ob_ex);
        }
        catch(UnsupportedDimension _ob_ex)
        {
            out = handler.createExceptionReply();
            UnsupportedDimensionHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_plottable(org.omg.CORBA.portable.InputStream in,
                         org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            edu.iris.Fissures.IfSeismogramDC.RequestFilter _ob_a0 = edu.iris.Fissures.IfSeismogramDC.RequestFilterHelper.read(in);
            edu.iris.Fissures.Dimension _ob_a1 = edu.iris.Fissures.DimensionHelper.read(in);
            edu.iris.Fissures.Plottable[] _ob_r = get_plottable(_ob_a0, _ob_a1);
            out = handler.createReply();
            edu.iris.Fissures.PlottableSeqHelper.write(out, _ob_r);
        }
        catch(PlottableNotAvailable _ob_ex)
        {
            out = handler.createExceptionReply();
            PlottableNotAvailableHelper.write(out, _ob_ex);
        }
        catch(UnsupportedDimension _ob_ex)
        {
            out = handler.createExceptionReply();
            UnsupportedDimensionHelper.write(out, _ob_ex);
        }
        catch(edu.iris.Fissures.NotImplemented _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.NotImplementedHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_get_whole_day_sizes(org.omg.CORBA.portable.InputStream in,
                               org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        edu.iris.Fissures.Dimension[] _ob_r = get_whole_day_sizes();
        out = handler.createReply();
        edu.iris.Fissures.DimensionSeqHelper.write(out, _ob_r);
        return out;
    }
}