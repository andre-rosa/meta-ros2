# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a class for converting from a 2D laser scan as defined by     sensor_msgs/LaserScan into a point cloud as defined by sensor_msgs/PointCloud     or sensor_msgs/PointCloud2. In particular, it contains functionality to account     for the skew resulting from moving robots or tilting laser scanners."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/laser_geometry"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    libeigen \
    rclcpp \
    sensor-msgs \
    tf2 \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-cmake \
    libeigen \
    rclcpp \
    sensor-msgs \
    tf2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-cppcheck \
    ament-cmake-cpplint \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-cmake-lint-cmake \
    ament-cmake-uncrustify \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/laser_geometry-release/archive/release/crystal/laser_geometry/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f99d2b8a3067671a46b1de5f1ac029be"
SRC_URI[sha256sum] = "7eebd7deb07fcd802f465ded75470b19331e11795f26069a2d8ce438a316ff70"
S = "${WORKDIR}/laser_geometry-release-release-crystal-laser_geometry-2.0.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/laser-geometry/laser-geometry_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/laser-geometry/laser-geometry_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/laser-geometry/laser-geometry-${PV}_common.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
