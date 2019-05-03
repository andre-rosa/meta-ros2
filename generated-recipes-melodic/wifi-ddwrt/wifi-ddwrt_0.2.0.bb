# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Access to the DD-WRT wifi"
AUTHOR = "Austin Hendrix <ahendrix@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/wifi_ddwrt"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "wifi_ddwrt"

ROS_BUILD_DEPENDS = " \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    nav-msgs \
    pr2-msgs \
    python-mechanize \
    rospy \
    std-msgs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    nav-msgs \
    pr2-msgs \
    python-mechanize \
    rospy \
    std-msgs \
    tf \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/wifi_ddwrt-release/archive/release/melodic/wifi_ddwrt/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2e43ddfc6ac811f1634982f164935c75"
SRC_URI[sha256sum] = "d9315fb98ca9d63cd7fd67895b3430e832d674a01469a5af7ec18fbd0c57dc7e"
S = "${WORKDIR}/wifi_ddwrt-release-release-melodic-wifi_ddwrt-0.2.0-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('wifi-ddwrt', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/wifi-ddwrt/wifi-ddwrt_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/wifi-ddwrt/wifi-ddwrt-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/wifi-ddwrt/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/wifi-ddwrt/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
