# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The Robot Pose EKF package is used to estimate the 3D pose of a robot, based on (partial) pose measurements coming from different sources. It uses an extended Kalman filter with a 6D model (3D position and 3D orientation) to combine measurements from wheel odometry, IMU sensor and visual odometry. The basic idea is to offer loosely coupled integration with different sensors, where sensor signals are received as ROS messages."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
HOMEPAGE = "http://wiki.ros.org/robot_pose_ekf"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_BPN = "robot_pose_ekf"

ROS_BUILD_DEPENDS = " \
    bfl \
    geometry-msgs \
    message-generation \
    nav-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    bfl \
    geometry-msgs \
    message-runtime \
    nav-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    bfl \
    geometry-msgs \
    message-runtime \
    nav-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosbag \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/robot_pose_ekf-release/archive/release/melodic/robot_pose_ekf/1.14.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "76b6dbe3e9a4761a3cc75529809d1a61"
SRC_URI[sha256sum] = "5c00ee700ca2a69ca46e5162fa0bf0570a730ff566808059d7c6358fe350844a"
S = "${WORKDIR}/robot_pose_ekf-release-release-melodic-robot_pose_ekf-1.14.5-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/robot-pose-ekf/robot-pose-ekf_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/robot-pose-ekf/robot-pose-ekf_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-pose-ekf/robot-pose-ekf-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-pose-ekf/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-pose-ekf/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
