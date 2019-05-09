# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This package contains a class for converting from a 2D laser scan as defined by     sensor_msgs/LaserScan into a point cloud as defined by sensor_msgs/PointCloud     or sensor_msgs/PointCloud2. In particular, it contains functionality to account     for the skew resulting from moving robots or tilting laser scanners."
AUTHOR = "Dave Hershberger <dave.hershberger@sri.com>"
ROS_AUTHOR = "Tully Foote"
HOMEPAGE = "http://ros.org/wiki/laser_geometry"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "laser_geometry"
ROS_BPN = "laser_geometry"

ROS_BUILD_DEPENDS = " \
    angles \
    boost \
    cmake-modules \
    libeigen \
    roscpp \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    boost \
    libeigen \
    roscpp \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    boost \
    libeigen \
    roscpp \
    sensor-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/laser_geometry-release/archive/release/melodic/laser_geometry/1.6.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f9cc63311e2daf49ca415324dde352c3"
SRC_URI[sha256sum] = "d2c0acb926c14dd2000db4b395b3bbcc26b53fc76461f4cf7c262947e3ed9138"
S = "${WORKDIR}/laser_geometry-release-release-melodic-laser_geometry-1.6.4-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('laser-geometry', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('laser-geometry', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/laser-geometry/laser-geometry_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/laser-geometry/laser-geometry-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/laser-geometry/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/laser-geometry/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
