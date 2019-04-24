# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Provides a set of tools/actions for manipulating the pr2's tilting     laser. Simplifies previously complex tasks, such as fetching     a single sweep, given a set of desired parameters for both the laser     driver and tilting platform."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Radu Rusu"
HOMEPAGE = "http://ros.org/wiki/pr2_tilt_laser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_common_actions"
ROS_BPN = "pr2_tilt_laser_interface"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    laser-geometry \
    libeigen \
    message-generation \
    pcl-conversions \
    pcl-ros \
    pr2-msgs \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    laser-geometry \
    libeigen \
    message-runtime \
    pcl-conversions \
    pcl-ros \
    pr2-msgs \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    laser-geometry \
    libeigen \
    message-runtime \
    pcl-conversions \
    pcl-ros \
    pr2-msgs \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_common_actions-release/archive/release/melodic/pr2_tilt_laser_interface/0.0.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2c0f27a222e00726c9b9024f00aa8784"
SRC_URI[sha256sum] = "8d25bddf370f8550b5ddac3e38c98c17d4880893c20bc601f8fd8b86c5bc4c2c"
S = "${WORKDIR}/pr2_common_actions-release-release-melodic-pr2_tilt_laser_interface-0.0.11-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pr2-common-actions', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pr2-common-actions', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-common-actions/pr2-common-actions_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-common-actions/pr2-common-actions-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-common-actions/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-common-actions/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
