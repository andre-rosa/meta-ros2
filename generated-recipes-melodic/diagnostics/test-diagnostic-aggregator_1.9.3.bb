# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Basic diagnostic_aggregator tests are  in the"
AUTHOR = "Brice Rebsamen <brice.rebsamen@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/test_diagnostic_aggregator"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "test_diagnostic_aggregator"

ROS_BUILD_DEPENDS = " \
    diagnostic-aggregator \
    diagnostic-msgs \
    pluginlib \
    roscpp \
    rospy \
    rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-aggregator \
    diagnostic-msgs \
    pluginlib \
    roscpp \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-aggregator \
    diagnostic-msgs \
    pluginlib \
    roscpp \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/melodic/test_diagnostic_aggregator/1.9.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3fdac5f1a2d26f9651e7b42b9d78b704"
SRC_URI[sha256sum] = "4c49680ea5fe2d6e4c792d09848623c3b0206126ad171c4b4dd61f400c9abfe3"
S = "${WORKDIR}/diagnostics-release-release-melodic-test_diagnostic_aggregator-1.9.3-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/diagnostics/diagnostics_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/diagnostics/diagnostics_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/diagnostics/diagnostics-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/diagnostics/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/diagnostics/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
