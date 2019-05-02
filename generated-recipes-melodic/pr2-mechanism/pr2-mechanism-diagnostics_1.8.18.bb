# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The `pr2_mechanism_diagnostics` node subscribes to `mechanism_statistics` and publishes diagnostics data for joints and controllers on `/diagnostics`."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
HOMEPAGE = "http://ros.org/wiki/pr2_mechanism_diagnostics"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "pr2_mechanism_diagnostics"

ROS_BUILD_DEPENDS = " \
    angles \
    diagnostic-msgs \
    diagnostic-updater \
    pr2-mechanism-model \
    pr2-mechanism-msgs \
    roscpp \
    rostest \
    std-msgs \
    std-srvs \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    diagnostic-msgs \
    diagnostic-updater \
    pr2-mechanism-model \
    pr2-mechanism-msgs \
    roscpp \
    rospy \
    std-msgs \
    std-srvs \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    diagnostic-msgs \
    diagnostic-updater \
    pr2-mechanism-model \
    pr2-mechanism-msgs \
    roscpp \
    rospy \
    std-msgs \
    std-srvs \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_mechanism-release/archive/release/melodic/pr2_mechanism_diagnostics/1.8.18-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "907071121d4c2c406e2eab13aeb8663f"
SRC_URI[sha256sum] = "3d6fbbd7282c6a07b6ea340848aa1fb79444832f19224508ed20fab0e73bf98c"
S = "${WORKDIR}/pr2_mechanism-release-release-melodic-pr2_mechanism_diagnostics-1.8.18-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/pr2-mechanism/pr2-mechanism_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/pr2-mechanism/pr2-mechanism_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-mechanism/pr2-mechanism-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-mechanism/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-mechanism/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
