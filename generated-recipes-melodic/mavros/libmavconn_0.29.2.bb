# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "MAVLink communication library.     This library provide unified connection handling classes     and URL to connection object mapper.      This library can be used in standalone programs."
AUTHOR = "Vladimir Ermakov <vooon341@gmail.com>"
ROS_AUTHOR = "Vladimir Ermakov <vooon341@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/mavros"
SECTION = "devel"
LICENSE = "GPL-3 & LGPL-2 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=1e7b3bcc2e271699c77c769685058cbe"

ROS_CN = "mavros"
ROS_BPN = "libmavconn"

ROS_BUILD_DEPENDS = " \
    boost \
    console-bridge \
    mavlink \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    console-bridge \
    mavlink \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    console-bridge \
    mavlink \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/libmavconn/0.29.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "78df0c101150b0d567e58e4e92a29280"
SRC_URI[sha256sum] = "01a2d5c29791a6b4a85dc55a16b5a904fa22c58e73c99df0172cf8e8870c02b2"
S = "${WORKDIR}/mavros-release-release-melodic-libmavconn-0.29.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('mavros', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('mavros', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mavros/mavros_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mavros/mavros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mavros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mavros/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
