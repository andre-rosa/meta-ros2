# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "mrpt_icp_slam_2d contains a wrapper on MRPT's 2D ICP-SLAM algorithms."
AUTHOR = "Jose Luis Blanco Claraco <jlblanco@ual.es>"
ROS_AUTHOR = "Jose Luis Blanco Claraco"
HOMEPAGE = "http://ros.org/wiki/mrpt_icp_slam_2d"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mrpt_slam"
ROS_BPN = "mrpt_icp_slam_2d"

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

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/melodic/mrpt_icp_slam_2d/0.1.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ffb303e33a153fc731c9996c76ed4891"
SRC_URI[sha256sum] = "aca7e53d844693e92f1d043660b5982dce6739932f68f63943fb87763bb6a616"
S = "${WORKDIR}/mrpt_slam-release-release-melodic-mrpt_icp_slam_2d-0.1.9-0"

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
