# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Network interfaces and messages."
AUTHOR = "AutonomouStuff Software Development Team <software@autonomoustuff.com>"
ROS_AUTHOR = "Joshua Whitley <jwhitley@autonomoustuff.com>"
HOMEPAGE = "https://github.com/astuff/network_interface/issues"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "network_interface"
ROS_BPN = "network_interface"

ROS_BUILD_DEPENDS = " \
    message-generation \
    roslint \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/astuff/network_interface-release/archive/release/melodic/network_interface/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "69dd293365a0e2a788102e28068ed096"
SRC_URI[sha256sum] = "5998b4fc5c5a96474d6a2ab83d3c55f7f5e847af5f909f00176deda4f6612ccf"
S = "${WORKDIR}/network_interface-release-release-melodic-network_interface-2.1.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('network-interface', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('network-interface', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/network-interface/network-interface_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/network-interface/network-interface-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/network-interface/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/network-interface/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
