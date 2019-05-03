# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "CAN bus introspection"
AUTHOR = "Micho Radovnikovich <mradovnikovich@dataspeedinc.com>"
HOMEPAGE = "http://dataspeedinc.com"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "dataspeed_can_tools"

ROS_BUILD_DEPENDS = " \
    can-msgs \
    rosbag \
    roscpp \
    roslib \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    can-msgs \
    rosbag \
    roscpp \
    roslib \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    can-msgs \
    rosbag \
    roscpp \
    roslib \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_can-release/archive/release/melodic/dataspeed_can_tools/1.0.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "00a90c4f6ba3027eb5752c7d5ed3e1fc"
SRC_URI[sha256sum] = "164f92e63ab8188d83e4107e9cb19fdf9db3c96a44282ffb85833bc0c58bfb98"
S = "${WORKDIR}/dataspeed_can-release-release-melodic-dataspeed_can_tools-1.0.12-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('dataspeed-can', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/dataspeed-can/dataspeed-can_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/dataspeed-can/dataspeed-can-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/dataspeed-can/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/dataspeed-can/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
