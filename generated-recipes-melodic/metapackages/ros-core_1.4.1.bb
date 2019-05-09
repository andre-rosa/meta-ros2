# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "A metapackage to aggregate the packages required to use publish / subscribe, services, launch files, and other core ROS concepts."
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
ROS_AUTHOR = "Dirk Thomas"
HOMEPAGE = "https://github.com/ros/metapackages"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "metapackages"
ROS_BPN = "ros_core"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
    class-loader \
    cmake-modules \
    common-msgs \
    gencpp \
    geneus \
    genlisp \
    genmsg \
    gennodejs \
    genpy \
    message-generation \
    message-runtime \
    pluginlib \
    ros \
    ros-comm \
    rosbag-migration-rule \
    rosconsole \
    rosconsole-bridge \
    roscpp-core \
    rosgraph-msgs \
    roslisp \
    rospack \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/melodic/ros_core/1.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7a41b6c7778f0716cfe3d67aa6378c87"
SRC_URI[sha256sum] = "390d24da9397fce3a11f1dc7a0a23fb0886b81a4cfd2473906508358a670782d"
S = "${WORKDIR}/metapackages-release-release-melodic-ros_core-1.4.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('metapackages', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('metapackages', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/metapackages/metapackages_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/metapackages/metapackages-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/metapackages/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/metapackages/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
