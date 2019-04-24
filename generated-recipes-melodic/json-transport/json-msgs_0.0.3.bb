# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "JSON ROS message"
AUTHOR = "Paul Bovbel <pbovbel@locusrobotics.com>"
ROS_AUTHOR = "Paul Bovbel <pbovbel@locusrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=37;endline=37;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "json_transport"
ROS_BPN = "json_msgs"

ROS_BUILD_DEPENDS = " \
    message-generation \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/locusrobotics/json_transport-release/archive/release/melodic/json_msgs/0.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6f320c7eafb0724acd4d6ef9701e2ced"
SRC_URI[sha256sum] = "bf40e01a92a86cd7c5f7c56e26b160dd8425c7bdcaee3d407ceac8f6dfc115f8"
S = "${WORKDIR}/json_transport-release-release-melodic-json_msgs-0.0.3-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('json-transport', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('json-transport', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/json-transport/json-transport_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/json-transport/json-transport-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/json-transport/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/json-transport/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
