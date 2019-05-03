# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This package enables you to record a rawlog from a ROS drive robot.   At the moment the package is able to deal with odometry and 2d laser scans."
AUTHOR = "Markus Bader <markus.bader@tuwien.ac.at>"
HOMEPAGE = "http://wiki.ros.org/mrpt_rawlog"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "mrpt_rawlog"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    marker-msgs \
    mrpt-bridge \
    mrpt-msgs \
    mrpt1 \
    nav-msgs \
    rosbag \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    marker-msgs \
    mrpt-bridge \
    mrpt-msgs \
    mrpt1 \
    nav-msgs \
    rosbag \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    marker-msgs \
    mrpt-bridge \
    mrpt-msgs \
    mrpt1 \
    nav-msgs \
    rosbag \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_rawlog/0.1.24-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "29e7efea41f67c5fd406c228e5905b8e"
SRC_URI[sha256sum] = "ba078d9fd48fddd9d067b7961f4102594d598ae3929b4146dce99793ca31479b"
S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_rawlog-0.1.24-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('mrpt-navigation', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mrpt-navigation/mrpt-navigation_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mrpt-navigation/mrpt-navigation-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mrpt-navigation/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mrpt-navigation/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
