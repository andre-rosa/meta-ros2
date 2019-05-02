# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The roscompile package"
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "roscompile"

ROS_BUILD_DEPENDS = " \
    catkin \
    ros-introspection \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    catkin \
    ros-introspection \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
    ros-introspection \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    geometry-msgs \
    pluginlib \
    roslint \
    tf \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/wu-robotics/roscompile-release/archive/release/melodic/roscompile/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "42d5510382090071112afc0228b50cf4"
SRC_URI[sha256sum] = "09449c45a4b93695d6faf539f2d2a59f91c971d54f38beb9b0ecd317f18e702c"
S = "${WORKDIR}/roscompile-release-release-melodic-roscompile-1.0.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/roscompile/roscompile_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/roscompile/roscompile_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/roscompile/roscompile-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/roscompile/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/roscompile/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
