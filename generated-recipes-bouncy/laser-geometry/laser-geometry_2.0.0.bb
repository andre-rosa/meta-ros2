# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This package contains a class for converting from a 2D laser scan as defined by     sensor_msgs/LaserScan into a point cloud as defined by sensor_msgs/PointCloud     or sensor_msgs/PointCloud2. In particular, it contains functionality to account     for the skew resulting from moving robots or tilting laser scanners."
AUTHOR = "William Woodall <william@osrfoundation.org>"
ROS_AUTHOR = "Dave Hershberger <dave.hershberger@sri.com>"
HOMEPAGE = "http://ros.org/wiki/laser_geometry"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "laser_geometry"
ROS_BPN = "laser_geometry"

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

SRC_URI = "https://github.com/ros2-gbp/laser_geometry-release/archive/release/bouncy/laser_geometry/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "83b93cfe150b0fa259a4e45678ea5cca"
SRC_URI[sha256sum] = "c049c41b52ce6be24ba955f6e545d644201ec707e2c5953bcb3284b9802bfda8"
S = "${WORKDIR}/laser_geometry-release-release-bouncy-laser_geometry-2.0.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('laser-geometry', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('laser-geometry', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/laser-geometry/laser-geometry_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/laser-geometry/laser-geometry-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/laser-geometry/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/laser-geometry/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
