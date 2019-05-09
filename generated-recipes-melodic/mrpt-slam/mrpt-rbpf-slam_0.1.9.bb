# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This package is used for gridmap SLAM. The interface is similar to gmapping (http://wiki.ros.org/gmapping) but the package supports different particle-filter algorithms, range-only SLAM, can work with several grid maps simultaneously and more."
AUTHOR = "Vladislav Tananaev <v.d.tananaev@gmail.com>"
ROS_AUTHOR = "Vladislav Tananaev"
HOMEPAGE = "http://www.mrpt.org/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mrpt_slam"
ROS_BPN = "mrpt_rbpf_slam"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    mrpt-bridge \
    mrpt1 \
    nav-msgs \
    roscpp \
    roslaunch \
    roslib \
    sensor-msgs \
    std-msgs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    mrpt-bridge \
    mrpt1 \
    nav-msgs \
    roscpp \
    roslaunch \
    roslib \
    sensor-msgs \
    std-msgs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    mrpt-bridge \
    mrpt-rawlog \
    mrpt1 \
    mvsim \
    nav-msgs \
    roscpp \
    roslaunch \
    roslib \
    rviz \
    sensor-msgs \
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

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/melodic/mrpt_rbpf_slam/0.1.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0a7f664977a174f9e336ec78f7007e89"
SRC_URI[sha256sum] = "ea3e077a2a2f682268bfe6ca88b95f03c26823ef8aa2f9cc50cc7a1c534228c2"
S = "${WORKDIR}/mrpt_slam-release-release-melodic-mrpt_rbpf_slam-0.1.9-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('mrpt-slam', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('mrpt-slam', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mrpt-slam/mrpt-slam_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mrpt-slam/mrpt-slam-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mrpt-slam/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mrpt-slam/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
