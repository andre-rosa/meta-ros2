# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The lgsvl_msgs package for ground truth data."
AUTHOR = "David Uhm <david.uhm@lge.com>"
ROS_AUTHOR = "David Uhm <david.uhm@lge.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "lgsvl_msgs"
ROS_BPN = "lgsvl_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/lgsvl/lgsvl_msgs-release/archive/release/melodic/lgsvl_msgs/0.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "cce51587a06baaa8e50398d0add88f52"
SRC_URI[sha256sum] = "2269c8659cbed4f904a98824cb128ee15b954efeb3b47bdb0152a61e2e69eba6"
S = "${WORKDIR}/lgsvl_msgs-release-release-melodic-lgsvl_msgs-0.0.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('lgsvl-msgs', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('lgsvl-msgs', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/lgsvl-msgs/lgsvl-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/lgsvl-msgs/lgsvl-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/lgsvl-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/lgsvl-msgs/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
