# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Bindings and low-level controllers for ArbotiX-powered robots."
AUTHOR = "Michael Ferguson <mike@vanadiumlabs.com>"
HOMEPAGE = "http://ros.org/wiki/arbotix_python"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    arbotix-msgs \
    control-msgs \
    diagnostic-msgs \
    geometry-msgs \
    nav-msgs \
    python-serial \
    rospy \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    arbotix-msgs \
    control-msgs \
    diagnostic-msgs \
    geometry-msgs \
    nav-msgs \
    python-serial \
    rospy \
    sensor-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/vanadiumlabs/arbotix_ros-release/archive/release/melodic/arbotix_python/0.10.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e80930a781d1d4766aa1b585a0c44d2d"
SRC_URI[sha256sum] = "cef79742fd412330d7bf8982775ca8aac8ddc936b1ebe0744ac07a47375a5469"
S = "${WORKDIR}/arbotix_ros-release-release-melodic-arbotix_python-0.10.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/arbotix/arbotix_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/arbotix/arbotix_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/arbotix/arbotix-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/arbotix/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/arbotix/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
