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

package edu.iris.Fissures.IfEvent;

//
// IDL:iris.edu/Fissures/IfEvent/EventChannelDefinition:1.0
//
final public class EventChannelDefinitionHelper
{
    public static void
    insert(org.omg.CORBA.Any any, EventChannelDefinition val)
    {
        org.omg.CORBA.portable.OutputStream out = any.create_output_stream();
        write(out, val);
        any.read_value(out.create_input_stream(), type());
    }

    public static EventChannelDefinition
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
            org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[9];

            members[0] = new org.omg.CORBA.StructMember();
            members[0].name = "name";
            members[0].type = EventChannelNameHelper.type();

            members[1] = new org.omg.CORBA.StructMember();
            members[1].name = "the_area";
            members[1].type = edu.iris.Fissures.AreaHelper.type();

            members[2] = new org.omg.CORBA.StructMember();
            members[2].name = "min_depth";
            members[2].type = edu.iris.Fissures.LengthHelper.type();

            members[3] = new org.omg.CORBA.StructMember();
            members[3].name = "max_depth";
            members[3].type = edu.iris.Fissures.LengthHelper.type();

            members[4] = new org.omg.CORBA.StructMember();
            members[4].name = "search_types";
            members[4].type = MagTypeHelper.type();

            members[5] = new org.omg.CORBA.StructMember();
            members[5].name = "min_magnitude";
            members[5].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_float);

            members[6] = new org.omg.CORBA.StructMember();
            members[6].name = "max_magnitude";
            members[6].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_float);

            members[7] = new org.omg.CORBA.StructMember();
            members[7].name = "catalogs";
            members[7].type = CatalogSeqHelper.type();

            members[8] = new org.omg.CORBA.StructMember();
            members[8].name = "contributors";
            members[8].type = ContributorSeqHelper.type();

            typeCode_ = orb.create_struct_tc(id(), "EventChannelDefinition", members);
        }

        return typeCode_;
    }

    public static String
    id()
    {
        return "IDL:iris.edu/Fissures/IfEvent/EventChannelDefinition:1.0";
    }

    public static EventChannelDefinition
    read(org.omg.CORBA.portable.InputStream in)
    {
        EventChannelDefinition _ob_v = new EventChannelDefinition();
        _ob_v.name = EventChannelNameHelper.read(in);
        _ob_v.the_area = edu.iris.Fissures.AreaHelper.read(in);
        _ob_v.min_depth = edu.iris.Fissures.LengthHelper.read(in);
        _ob_v.max_depth = edu.iris.Fissures.LengthHelper.read(in);
        _ob_v.search_types = MagTypeHelper.read(in);
        _ob_v.min_magnitude = in.read_float();
        _ob_v.max_magnitude = in.read_float();
        _ob_v.catalogs = CatalogSeqHelper.read(in);
        _ob_v.contributors = ContributorSeqHelper.read(in);
        return _ob_v;
    }

    public static void
    write(org.omg.CORBA.portable.OutputStream out, EventChannelDefinition val)
    {
        EventChannelNameHelper.write(out, val.name);
        edu.iris.Fissures.AreaHelper.write(out, val.the_area);
        edu.iris.Fissures.LengthHelper.write(out, val.min_depth);
        edu.iris.Fissures.LengthHelper.write(out, val.max_depth);
        MagTypeHelper.write(out, val.search_types);
        out.write_float(val.min_magnitude);
        out.write_float(val.max_magnitude);
        CatalogSeqHelper.write(out, val.catalogs);
        ContributorSeqHelper.write(out, val.contributors);
    }
}
